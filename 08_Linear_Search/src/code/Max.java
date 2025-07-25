package code;

public class Max {
    public static void main(String[] args) {
        int[][] arr = {
                {14, 36, 2, 5},
                {75, 265, 36},
                {4, 26, 30, 7},
                {47, 23}
        };
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(max < arr[row][col]){
//                    max = arr[row][col];
//                }
//            }
//        }

        // OR
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
