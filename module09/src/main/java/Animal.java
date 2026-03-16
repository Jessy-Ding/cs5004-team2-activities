/**
 * Base animal type that can walk.
 *
 * <p>This HackerRank inheritance example defines shared behavior in {@code Animal}
 * and lets {@code Bird} inherit it.
 *
 * @author Mengyuan Ding
 * @since 2026-03-11
 * CS5004 Object-Oriented Design
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
 *
 * @since 2026-03-11
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
 *
 * @since 2026-03-11
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
