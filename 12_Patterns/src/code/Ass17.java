package code;

import java.util.Scanner;

public class Ass17 {
    public static void main(String[] args) {
        // Reverse Alphabet Right-Angle Triangle Pattern

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            char ch = (char)('A' + n-1);
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
        sc.close();
    }
}
