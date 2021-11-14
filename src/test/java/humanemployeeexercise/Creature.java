package humanemployeeexercise;

public interface Creature {

    boolean isBreathable = true;

    default void getMeaning() {
        System.out.println("Creature: something created either animate or inanimate.");
    }

    void respiration();
}