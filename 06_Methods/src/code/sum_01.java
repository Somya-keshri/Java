package code;

import java.util.Scanner;

public class sum_01 {
    public static void main(String[] args){
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
//        System.out.println("Unreachable statement");
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
    /*
        return_type name (arguments) {
            // body
            return statement;
        }
    */
}
