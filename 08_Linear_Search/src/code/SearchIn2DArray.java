package code;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {14, 36, 2, 5},
                {75, 265, 36},
                {4, 26, 30, 7},
                {47, 23}
        };
        int target = 7;
        int[] ans = search(arr, target);  // format of return value {row, col}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
