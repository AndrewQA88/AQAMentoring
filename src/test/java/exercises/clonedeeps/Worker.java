package exercises.clonedeeps;

import com.rits.cloning.Cloner;

public class Worker {

    String firstName;
    String lastName;
    int age;
    String sex;
    String bloodType;


    public Worker(String firstName, String lastName, int age, String sex, String bloodType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.bloodType = bloodType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", bloodType='" + bloodType + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + sex.hashCode() + bloodType.hashCode();
    }

    public static void main(String[] args) {
        Worker initial = new Worker("Bob", "Tailor", 25, "male", "II+");
        System.out.println(initial);
        System.out.println("Hash code of initial object: " + initial.hashCode());

        Cloner cloner = new Cloner();

        Worker cloned = cloner.deepClone(initial);
        System.out.println("Hash code of cloned object: " + cloned.hashCode());
        cloned.setFirstName("Alex");
        System.out.println("Hash code of cloned object after update: " + cloned.hashCode());
        System.out.println(cloned);
    }
}
