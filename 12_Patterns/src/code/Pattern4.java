package code;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n+1-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
