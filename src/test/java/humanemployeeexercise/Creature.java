package humanemployeeexercise;

public interface Creature {

    default void getMeaning() {
        System.out.println("Creature: something created either animate or inanimate.");
    }
}