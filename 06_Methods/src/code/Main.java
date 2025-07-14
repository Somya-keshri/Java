package code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q. Take input of 2 num and print the sum
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter num1: ");
        num1 = in.nextInt();
        System.out.println("Enter num2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
