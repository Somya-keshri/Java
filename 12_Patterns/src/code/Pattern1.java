package code;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        //int n=4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of rows: ");
        int n = sc.nextInt();
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
