package first;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int num = input.nextFloat();    // wrong  in int we cant store float

//        float num = input.nextInt();      // in float we can store int
//        System.out.println(num);

        int no = (int)(67.32f);       // 67
        System.out.println(no);       // type casting

        // Automatic type promotion in expressions
        int a = 257;
        byte n = (byte)(a);     // 257 % 256 = 1

        System.out.println(n);      // 1

        byte p = 40;
        byte q = 50;
        byte r = 100;
        int t = (p * q) / r;

        System.out.println(t);         // 20

//        byte m = 50;
//        m = m * 20;         // this will give error (byte can't store that much value)

        int number = 'A';
        System.out.println(number);   // ASCII value
        // Java follow unicode value

        System.out.println(3 * 5.6f);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        // smaller value converted to bigger value
        System.out.println((f * b) + "  |  " + (i / c) + "  |  " + (d * s));
        System.out.println(result);
    }
}
