import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;

public class SimpleXMLReader {

    /**
     * Reads an XML file and parses it into a list of Person objects using SAX.
     * SAX is event-based — it reads the file top to bottom and triggers methods
     * when it hits opening tags, closing tags, or text content.
     */
    public void read(String filePath) {
        try {
            File inputFile = new File(filePath);

            // SAXParserFactory creates the parser for us
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            // This list will hold all the Person objects we build from the XML
            List<Person> people = new ArrayList<>();

            // The handler contains our logic for what to do at each XML event
            SimpleXMLHandler handler = new SimpleXMLHandler(people);

            // Start parsing — this walks through the file and calls our handler methods
            saxParser.parse(inputFile, handler);

            System.out.println(people);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This handler defines what happens when the parser encounters
     * start tags, end tags, and text content in the XML file.
     *
     * The flow for each element is:
     * startElement() -> characters() -> endElement()
     *
     * For example, when parsing <name>John Doe</name>:
     * 1. startElement fires for <name>, resets the buffer
     * 2. characters fires for "John Doe", appends it to the buffer
     * 3. endElement fires for </name>, we grab the buffer content and store it
     */
    static class SimpleXMLHandler extends DefaultHandler {

        List<Person> people;          // final list we're building up
        Map<String, String> current;  // holds fields for the person we're currently reading
        StringBuffer buffer = new StringBuffer(); // collects text between tags

        SimpleXMLHandler(List<Person> people) {
            this.people = people;
        }

        /**
         * Called when the parser hits an opening tag like <person> or <name>.
         * We reset the buffer here so old text doesn't leak into the next element.
         * If the tag is <person>, we create a new map to start collecting that person's data.
         */
        @Override
        public void startElement(String uri, String localName, String qName,
                                 Attributes attributes) {
            buffer.setLength(0); // important! without this, data from previous tags leaks in
            if (qName.equalsIgnoreCase("person")) {
                current = new HashMap<>(); // start fresh map for this person
            }
        }

        /**
         * Called when the parser hits a closing tag like </person> or </name>.
         * If we reached </person>, we have all the fields so we build a Person and add it.
         * For other tags like </name>, </age>, </city>, we store the buffer text in the map.
         */
        @Override
        public void endElement(String uri, String localName, String qName) {
            if (qName.equalsIgnoreCase("person")) {
                // We're done with this person, build the object and add to list
                people.add(Person.fromMap(current));
                current = null; // clear it so we know we're not inside a <person> block
            } else {
                if (current != null) {
                    // Store the text we collected — key is the tag name, value is the text
                    // e.g. for <name>John Doe</name>, this puts ("name", "John Doe")
                    current.put(qName, buffer.toString());
                }
            }
        }

        /**
         * Called when the parser reads text content between tags.
         * For <name>John Doe</name>, this gets called with "John Doe".
         * We just append it to the buffer — endElement will deal with it later.
         */
        @Override
        public void characters(char[] ch, int start, int length) {
            buffer.append(ch, start, length);
        }
    }

    public static void main(String[] args) {
        SimpleXMLReader reader = new SimpleXMLReader();
        reader.read("simple.xml");
    }
}
