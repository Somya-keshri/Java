package code;

import java.util.Scanner;

public class Ass7 {
    public static void main(String[] args) {
        // HOLLOW DIAMOND PATTERN

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= 2*n-1; row++) {
            int left;
            int right;

            if(row<n){
                left=n-row+1;
                right=n+row-1;
            }
            else {
                left=row-n+1;
                right=2*n-left;
            }

            for (int col = 1; col <= 2*n-1; col++) {
                if (col==left || col==right){
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
