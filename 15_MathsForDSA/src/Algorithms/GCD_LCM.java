package Algorithms;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a, int b){
        return a*b / gcd(a, b);
    }
}
