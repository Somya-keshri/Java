package code;

import java.util.Scanner;

public class Ass12 {
    public static void main(String[] args) {
        // NUMBER PYRAMID PATTERN

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
