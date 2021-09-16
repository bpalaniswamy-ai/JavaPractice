package Practice;

public class Operators {

    public static void postIncrement(int x){
        int y = 0;
        System.out.println("x: "+ x + " y: " + y);
        y = x++;
        System.out.println("Post Increment: y=x++ y is " + y + " x is "+ x);
    }

    public static void preIncrement(int x){
        int y = ++x;
        System.out.println("Pre Increment: y=++x y is " + y + " x is "+ x);
    }

    public static void postDecrement(int x){
        int y = x--;
        System.out.println("Post Decrement: y=x-- y is " + y + " x is "+ x);
    }

    public static void preDecrement(int x){
        int y = --x;
        System.out.println("Pre Decrement: y=--x y is " + y + " x is "+ x);
    }


    public static void main(String[] args) {

        int x = 5;

        //unaryOperators
        System.out.println("Unary  operators");
        Operators.postIncrement(x);
        Operators.preIncrement(x);
        Operators.postDecrement(x);
        Operators.preDecrement(x);

        int i = 40, j = 30;
        System.out.println();
        System.out.println("i: " + i + ", j: " + j );

        //addition
        System.out.println("i + j = " + (i + j));

        //subtraction
        System.out.println("i - j = " + (i - j));

        //multiplication
        System.out.println("i * j = " + (i * j));

        //division
        System.out.println("i / j = " + (i / j));

        //modulus
        System.out.println("i % j = " + (i % j));

        //comparison operators
        System.out.println();
        System.out.println("Comparison operators");
        System.out.println("i < j:" + (i < j));
        System.out.println("i > j:" + (i > j));
        System.out.println("i <= j:" + (i <= j));
        System.out.println("i >= j:" + (i >= j));

        //logical operators
        boolean flag1 = true, flag2 = false;
        System.out.println();
        System.out.println("Logical operators");

        System.out.println("flag1: " + flag1);
        System.out.println("flag2: " + flag2);
        System.out.println();
        System.out.println("flag1 && flag2: " + (flag1 && flag2));
        System.out.println("flag1 || flag2: " + (flag1 || flag2));
        System.out.println("!flag2: " + (!flag2));

        //Bitshift Operator
        System.out.println("8 << 3: " + (8 << 3));
        System.out.println("64 >> 3: " + (64 >> 3));
        System.out.println("64 >>> 3: " + (64 >>> 3));

    }
}
