package code;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-11, -5, 0, 3, 14, 23, 31, 39, 45, 57, 65};
        int target = 57;
        System.out.println(binary(arr, target));
    }
    static int binary(int[] arr, int target){
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
                return mid;
            }
        }
        return -1;
    }
}
