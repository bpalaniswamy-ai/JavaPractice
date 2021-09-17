package Practice;

public class MathFunctions {
    public static void main(String[] args) {
        double i = 32.55;

        //round
        double j = Math.round(i);
        System.out.println(j);

        //ceil and floor
        double k = Math.ceil(i);
        double l = Math.floor(i);
        System.out.println(k);
        System.out.println(l);

        double m = -25;

        //abs
        double n = Math.abs(m);
        System.out.println(n);

        //random number 0 to 99
        double o = Math.random();
        System.out.println((int) (o * 100));

        //power
        System.out.println(Math.pow(3, 4));

        //square root
        System.out.println(Math.sqrt(16));
    }
}
