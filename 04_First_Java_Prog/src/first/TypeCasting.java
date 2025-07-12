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
        int a = 250;
        byte b = (byte)(a);     // 257 % 256 = 1

        System.out.println(b);
    }
}
