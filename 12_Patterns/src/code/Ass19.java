package code;

import java.util.Scanner;

public class Ass19 {
    public static void main(String[] args) {
        // Hourglass Shape Pattern

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row-1; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*n-2*row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 2; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
