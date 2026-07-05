package code;

import java.util.Scanner;

public class Ass14 {
    public static void main(String[] args) {
        // Alphabet Triangle Pattern
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            char ch = 'A';
            for (int col = 1; col <= row; col++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
