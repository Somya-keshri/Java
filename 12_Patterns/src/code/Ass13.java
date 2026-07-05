package code;

import java.util.Scanner;

public class Ass13 {
    public static void main(String[] args) {
        // Floyd’s Triangle Pattern

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();
        int m=1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
        sc.close();
    }
}
