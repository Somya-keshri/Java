package ques;

public class Max {
    public static void main(String[] args) {
        int[] arr = {7, 9, 35, 21, 14};
        System.out.println(max(arr));

        int[] arry = {74, 63, 25, 3, 91};
        System.out.println(maxRange(arry, 1, 4));
    }

    static int max(int[] arr){
        if(arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arry, int start, int end){
        if(start > end){
            return -1;
        }
        if (arry == null) {
            return -1;
        }
        int maxVal = arry[start];
        for (int i = start; i <= end; i++) {
            if(arry[i] > maxVal){
                maxVal = arry[i];
            }
        }
        return maxVal;
    }
}
