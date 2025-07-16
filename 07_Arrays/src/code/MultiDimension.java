package code;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
//        int[][] arr = new int[3][];
        // writing num of rows is mandatory

        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        Scanner in = new Scanner(System.in);
        int[][] inp = new int[3][2];
        System.out.println(inp.length);       // no of rows

        // input
        for (int row = 0; row < inp.length; row++) {
            // for each column in each row
            for (int col = 0; col < inp[row].length; col++) {
                inp[row][col] = in.nextInt();
            }
        }
        // output
        // Method 1
//        for (int row = 0; row < inp.length; row++) {
//            for (int col = 0; col < inp[row].length; col++) {
//                System.out.print(inp[row][col] + "  ");
//            }
//            System.out.println();
//        }

        // Method 2
//        for (int row = 0; row < inp.length; row++){
//            System.out.println(Arrays.toString(inp[row]));
//        }

        // Method 3
        for(int[] a : inp){
            System.out.println(Arrays.toString(a));
        }
    }
}
