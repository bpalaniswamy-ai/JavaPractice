package Practice;

public class Variables {
    public static void main(String[] args) {
        byte a = 127; // -128 to 127
        short b = 31232; // -32,768 to 32,767
        int c = 546556792; // -2,147,483,648 to 2,147,483,647
        long d = 456876553 ; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float e = 208.456f;
        double f = 67897.45678902d;

        char g = 'a';
        String h = "Hello";

        boolean i = true;

        System.out.println("a: " + a + " is of byte datatype" );
        System.out.println("b: " + b + " is of short datatype" );
        System.out.println("c: " + c + " is of int datatype" );
        System.out.println("d: " + d + " is of long datatype" );
        System.out.println("e: " + e + " is of float datatype" );
        System.out.println("f: " + f + " is of double datatype" );
        System.out.println("g: " + g + " is of char datatype" );
        System.out.println("h: " + h + " is of String datatype" );
        System.out.println("i: " + i + " is of boolean datatype" );

    }
}
