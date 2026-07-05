package code;

import java.util.Scanner;

public class Ass8 {
    public static void main(String[] args) {
        // BUTTERFLY PATTERN

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int space = 1; space <= 2*n-2*row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            for (int space = 1; space <= (row-1)*2; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
