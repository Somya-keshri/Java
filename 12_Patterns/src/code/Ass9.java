package code;

import java.util.Scanner;

public class Ass9 {
    public static void main(String[] args) {
        // RHOMBUS PATTERN

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
