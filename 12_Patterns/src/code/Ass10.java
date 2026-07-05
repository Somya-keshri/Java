package code;

import java.util.Scanner;

public class Ass10 {
    public static void main(String[] args) {
        // NUMBER TRIANGLE PATTERN

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
