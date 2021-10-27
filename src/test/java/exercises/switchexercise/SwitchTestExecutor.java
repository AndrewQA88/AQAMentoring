package exercises.switchexercise;

public class SwitchTestExecutor {

    public static void main(String[] args) {
        NumberRange numberFromRange = new NumberRange();
        System.out.println("Method is implemented with If-else");
        numberFromRange.printNumberWithElseIf();
        System.out.println("----------------------------------");
        System.out.println("Method is implemented with Switch");
        numberFromRange.printNumberWithSwitch();
    }
}
