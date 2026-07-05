package code;

import java.util.Scanner;

public class Ass16 {
    public static void main(String[] args) {
        // Symmetric Alphabet Pyramid Pattern

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            char ch = 'A';

            for (int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                if (col<=row){
                    System.out.print(ch + " ");
                    ch++;
                }
                else {
                    ch-=2;
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

// Important