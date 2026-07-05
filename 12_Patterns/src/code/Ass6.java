package code;

import java.util.Scanner;

public class Ass6 {
    public static void main(String[] args) {
        // SOLID DIAMOND PATTERN

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        // Upper part
        for (int row = 1; row <= n-1; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= 2*row-1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row-1; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= 2*(n-row)+1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
