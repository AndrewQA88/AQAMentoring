package exercises;

public enum Iryna {
    IRA("Ira", 30), IRYNA("Iryna", 30), IRUSYA("Irusya", 30);

    private final String name;
    private final int age;

    Iryna(String name, int age) {
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
