package questions;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-11, -5, 0, 3, 14, 23, 31, 39, 45, 57, 65};
        int target = 21;
        System.out.println("index: " + ceiling(arr, target));
        System.out.println("Ceiling num = " + arr[ceiling(arr, target)]);
    }

    // return the index of smallest no >= target
    static int ceiling(int[] arr, int target){
        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                // ans found
                return mid;
            }
        }
        return start;
    }
}
