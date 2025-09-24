package code;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        System.out.println("isOdd: " + isOdd(n));
    }
    public static boolean isOdd(int n){
        return (n & 1) == 1;       // bitwise AND operator
    }
}
