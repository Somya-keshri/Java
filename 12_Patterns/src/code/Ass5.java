package code;

import java.util.Scanner;

public class Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= 2*n-1; col++) {

                int left = n-row+1;   // left boundary star
                int right = n+row-1;  // right boundary star

                if (col==left || col==right || row==n){
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

// Important