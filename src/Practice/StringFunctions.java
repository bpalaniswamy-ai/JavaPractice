package Practice;

public class StringFunctions {
    public static void main(String[] args) {
        String st1 = "Hello";
        String st2 = "world";
        String st3 = "Helloworld";
        String st4 = "Helloworld";
        String st5 = new String("Helloworld");
        String st6 = st1 + st2;

        System.out.println("st1: " + st1);
        System.out.println("st2: " + st2);
        System.out.println("st3: " + st3);
        System.out.println("st4: " + st4);
        System.out.println("st5: " + st5);
        System.out.println("st6: " + st6);
        System.out.println();
        System.out.println("Length of string st3: " + st3.length());
        System.out.println("st3 == st4: " + (st3 == st4));
        System.out.println("st3 == st5: " + (st3 == st5));
        System.out.println("st3 == st6: " + (st3 == st6));
        System.out.println("After interning st6");
        System.out.println("st3 == st6: " + (st3 == st6.intern()));
        System.out.println("st3 in uppercase: " + st3.toUpperCase());

        StringBuilder sb1 = new StringBuilder(st3);
        sb1.append("Good").append("Morning");
        System.out.println();
        System.out.println("sb1:" + sb1);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Good").append("bye");
        System.out.println("sb2:" + sb2);
        sb2.replace(4, 7, "day");
        System.out.println("sb2 replaced: " + sb2);

        StringBuilder sb3 = new StringBuilder("Good");
        sb3.append("morning");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Good").append("morning");

        System.out.println("sb3: " + sb3);
        System.out.println("sb4: " + sb4);
        System.out.println("sb3 == sb4: " + sb3.toString().equals(sb4.toString()));

    }
}
