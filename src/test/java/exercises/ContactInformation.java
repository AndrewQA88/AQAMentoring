package exercises;

public enum ContactInformation {
    IRA("Ira", 30),
    JHON("Jhon", 35),
    JACK("Jack", 49);

    private final String name;
    private final int age;

    ContactInformation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
