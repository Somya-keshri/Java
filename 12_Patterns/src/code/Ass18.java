package code;

import java.util.Scanner;

public class Ass18 {
    public static void main(String[] args) {
        // Pascal’s Triangle Pattern

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            int value = 1;

            for (int col = 1; col <= row; col++) {
                System.out.print(value + " ");
                value = value * (row-col)/col;
            }
            System.out.println();
        }
        sc.close();
    }
}
