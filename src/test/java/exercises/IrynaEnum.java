package exercises;

public class IrynaEnum {
    Iryna profile;

    IrynaEnum(Iryna profile) {
        this.profile = profile;
    }

    public static void main(String[] args) {
        // get name and age of enum value
        IrynaEnum info = new IrynaEnum(Iryna.IRA);
        System.out.println("Name: " + info.profile.getName());
        System.out.println("Age: " + info.profile.getAge());
        // get all values from enum
        System.out.println("------------------------------");
        Iryna[] irynaEnum = Iryna.values();
        for (Iryna names : irynaEnum) {
            System.out.println(names);
        }
    }
}
