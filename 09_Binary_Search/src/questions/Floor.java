package questions;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {-11, -5, 0, 3, 14, 23, 31, 39, 45, 57, 65};
        int target = 41;
        int ans = floor(arr, target);
        System.out.println(ans);
        System.out.println(arr[ans]);
    }

    // return the index of greatest no. <= target
    static int floor(int[] arr, int target){
        // bit what if target is less than the smallest num in the array
        if(target < arr[0]){
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
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
