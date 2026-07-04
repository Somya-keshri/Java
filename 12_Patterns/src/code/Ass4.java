package code;

import java.util.Scanner;

public class Ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n ; row++) {
            for (int space = 1; space <= row-1; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*n-2*row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Important