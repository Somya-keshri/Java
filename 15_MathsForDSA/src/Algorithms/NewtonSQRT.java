package Algorithms;

import java.util.Scanner;

public class NewtonSQRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(sqrt(n));
    }

    static double sqrt(double n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n/x));       // formula
            if (Math.abs(root - x) < 0.5) {
                break;
            }
            x = root;
        }
        return root;
    }
}
