package exercises;

public class Contact {
    ContactInformation profile;

    Contact(ContactInformation profile) {
        this.profile = profile;
    }

    public static void main(String[] args) {
        // get name and age of enum value
        Contact info = new Contact(ContactInformation.IRA);
        System.out.println("Name: " + info.profile.getName());
        System.out.println("Age: " + info.profile.getAge());
        // get all values from enum
        System.out.println("------------------------------");
        ContactInformation[] contacts = ContactInformation.values();
        for (ContactInformation names : contacts) {
            System.out.println(names);
        }
        System.out.println("------------------------------");
        // Enum "Ira" return enum value IRA
        ContactInformation contact = ContactInformation.valueOfName("Ira");
        System.out.println(contact);
    }
}
