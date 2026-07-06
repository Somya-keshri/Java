package code;

import java.util.Scanner;

public class Ass20 {
    public static void main(String[] args) {
        // ZIG-ZAG PATTERN

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= n; col++) {
                if((row + col) % 2 == 0){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

// Ques: for n=9
//      *       *
//    *   *   *   *
//  *       *       *

// Wrong solution