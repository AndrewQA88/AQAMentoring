package exercises;

public class Ternary {

    public static void main(String[] args) {
        Ternary ternary = new Ternary();
        ternary.test1();
        ternary.test2();
        ternary.test3();
        ternary.test4();
        ternary.test5();
        ternary.test6();
        ternary.test8();
    }

    public void test1() {
        int x = 0;
        int z = x == 0 ? 1 : 0;
        System.out.println(z);
    }

    public void test2() {
        int x = 3;
        String s = x < 3 ? "x" : "y";
        System.out.println(s);
    }

    public void test3() {
        int x = 2;
        int y = 6;
        String s = (y > (x + 4) || (y - 3) == x) ? "n" : "q";
        System.out.println(s);
    }

    public void test4() {
        String s = true ? "true" : "false";
        System.out.println(s);
    }

    public void test5() {
        int first = 1;
        int second = 3;
        boolean isLessThan = first < second ? true : false;
        System.out.println("first < second: " + isLessThan);
    }

    public void test6() {
        String first = "a";
        String second = "a";
        String x = first == second ? "The same!" : "Not matched!";
        System.out.println(x);

    }
        /*    int time = 22;
         if (time < 10) {
         System.out.println("Good morning.");
         } else if (time < 20) {
           System.out.println("Good day.");
         } else {
           System.out.println("Good evening.");
         }   */

    public void test8() {
        int time = 22;
        String s = time < 10 ? "Good morning."
                : ((time < 20) ? "Good day." :
                "Good evening.");
        System.out.println(s);
    }
}
