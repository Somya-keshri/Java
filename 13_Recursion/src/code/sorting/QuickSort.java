package code.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        // OR
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high){
        // Base condition: if the array (or subarray) has one or zero elements, it's already sorted
        if(low >= high){
            return;
        }

        int s = low;     // start pointer
        int e = high;     // end pointer

        // Choose pivot element (middle element here)
        int mid = s + (e - s) / 2;
        int pivot = nums[mid];

        while (s <= e){
            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot){
                s++;
            }
            while (nums[e] > pivot){
                e--;
            }

            // If s <= e, swap elements to put them in the correct partition
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        /*
         * After this loop:
           - All elements before index 'e' are less than or equal to the pivot.
           - All elements after index 's' are greater than or equal to the pivot.
            So, the pivot is now at its correct position in the sorted array.
         */

        // Recursively sort the left half (from 'low' to 'e') & the right half (from 's' to 'high')
        sort(nums, low, e);
        sort(nums, s, high);
    }

    // Best case:  TC = O(n log n) , SC = O(log n)
    // Worst case: TC = O(n²)  ,  SC = O(n)
}
