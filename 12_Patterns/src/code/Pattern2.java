package code;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(row==1 || row==n || col==1 || col==n){
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
