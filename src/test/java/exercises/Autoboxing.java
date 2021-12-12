package exercises;

public class Autoboxing {

    public static void main(String[] args) {
        int i = 100;
        double y = 36.6;
        Integer int1 = new Integer(5);
        Double dbl = Double.valueOf(y);
        Integer int2 = Integer.valueOf(i);
        int int3 = int1.intValue();
        double dbl2 = dbl.doubleValue();
        int int4 = int2;// third.intValue();
        Integer int5 = int4; // Integer.valueOf(sixth);


        System.out.println(int1);
        System.out.println(dbl);
        System.out.println(int2);
        System.out.println(int3);
        System.out.println(dbl2);
        System.out.println(int4);
        System.out.println(int5);
    }
}
