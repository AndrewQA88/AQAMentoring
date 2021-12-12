package exercises.hashcodes;

import java.util.HashMap;
import java.util.Map;

public class DriverLicence {

    int id;
    String category;

    public DriverLicence(int id, String category) {
        this.id = id;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return id * category.hashCode();
    }

    public static void main(String[] args) {

        Map<DriverLicence, String> list = new HashMap<>();
        list.put(new DriverLicence(1, "A"), "Andrew");
        list.put(new DriverLicence(2, "A"), "Bob");
        list.put(new DriverLicence(3, "A"), "Ivan");

        System.out.println(list.size());
        System.out.println(list.entrySet());
    }
}
