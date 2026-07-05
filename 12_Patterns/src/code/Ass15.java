package code;

import java.util.Scanner;

public class Ass15 {
    public static void main(String[] args) {
        // Inverted Alphabet Triangle Pattern
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            char ch = 'A';
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
