package code;

import java.util.Scanner;

public class Ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter num of columns: ");
        int m = sc.nextInt();

        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= m; col++) {
                if(row==1 || row==n || col==1 || col==m){
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
