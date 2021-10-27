package exercises;

public enum ContactInformation {
    IRA("Ira", 30),
    JHON("Jhon", 35),
    JACK("Jack", 49);

    private String name;
    private int age;

    ContactInformation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static ContactInformation valueOfName(String name) {
        for (ContactInformation e : values()) {
            if (e.name.equals(name)) {
                return e;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
