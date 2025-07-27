package code;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-11, -5, 0, 3, 14, 23, 31, 39, 45, 57, 65};
        int[] arr = {97, 85, 66, 59, 40, 35, 21, 10, 0, -7, -25};
        int target = 10;
        System.out.println(BS(arr, target));
    }
    static int BS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
