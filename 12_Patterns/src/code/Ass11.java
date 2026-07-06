package code;

import java.util.Scanner;

public class Ass11 {
    public static void main(String[] args) {
        // SYMMETRIC NUMBER PYRAMID PATTERN

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                if(col<=row){
                    System.out.print(col + " ");
                }
                else {
                    System.out.print(2*row-col + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
