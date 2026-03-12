/**
 * HackerRank-Java Inheritance I
 * Using inheritance, one class can acquire the properties of others. Consider the following Animal class:
 * <pre>{@code
 * class Animal{
 *     void walk(){
 *         System.out.println("I am walking");
 *     }
 * }
 * }</pre>
 * This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:
 * <pre>{@code
 * class Bird extends Animal {
 *     void fly() {
 *         System.out.println("I am flying");
 *     }
 * }
 * }</pre>
 * Finally, we can create a Bird object that can both fly and walk.
 *
 * <pre>{@code
 * public class Solution{
 *    public static void main(String[] args){
 *
 *       Bird bird = new Bird();
 *       bird.walk();
 *       bird.fly();
 *    }
 * }
 * }</pre>
 * The above code will print:
 * <pre>{@code
 * I am walking
 * I am flying
 * }</pre>
 * This means that a Bird object has all the properties that an Animal object has, as well as some additional unique properties.
 *
 * The code above is provided for you in your editor. You must add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:
 * <pre>{@code
 * I am walking
 * I am flying
 * I am singing
 * }</pre>
 *
 * @author Mengyuan Ding
 * @since 2026-03-11
 * course CS5004
 */
/**
 * Base animal type that can walk.
 */
class Animal{
    /**
     * Prints the walking action for the animal.
     */
    void walk(){
        System.out.println("I am walking");
    }
}

/**
 * Bird subtype that inherits walking and adds flying and singing behavior.
 */
class Bird extends Animal{
    /**
     * Prints the flying action for the bird.
     */
    void fly(){
        System.out.println("I am flying");
    }

    /**
     * Prints the singing action for the bird.
     */
    void sing(){
        System.out.println("I am singing");
    }
}

/**
 * Entry point that demonstrates inherited and bird-specific behavior.
 */
class Solution{
    /**
     * Runs the inheritance example by creating a bird and invoking its actions.
     *
     * @param args command-line arguments, unused
     */
    public static void main(String args[]){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
