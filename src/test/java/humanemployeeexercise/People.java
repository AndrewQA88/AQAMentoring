package humanemployeeexercise;

public abstract class People implements Creature {

    private int averageLifeCycle = 100;

    abstract void temperature();

    abstract void surroundings();

    abstract void foodSource();

    public void getAverageLifeCycleInYears(int averageLifeCycle) {
        this.averageLifeCycle = averageLifeCycle;
    }

    @Override
    public void respiration() {
        System.out.println("uses oxygen");
    }
}
