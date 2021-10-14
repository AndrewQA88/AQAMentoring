package exercises;

public class Casting {

    public static void main(String[] args) {
        int x = 1;
        double y = 0.1;
        int z = x + (int) y;
        System.out.println(z);

        double c = x + y;
        System.out.println(c);

        double q = 0.123;
        float w = (float) 1.4;
        float e = (float) q + w;
        System.out.println(e);

        int t = 2;
        short u = 1;
        short o = (short) (t + u);

        double j = 0.9;
        double h = 0.1;
        int v = (int) (j + h);

        int a;

    }
}