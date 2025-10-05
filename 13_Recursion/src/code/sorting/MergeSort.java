package code.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 56, 25, 31, 12, 43};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr){
        // Base case: if the array has only one element, it's already sorted
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        // Recursively sort the left half and the right half
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the two sorted halves
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;     // pointer for first array
        int j = 0;     // pointer for second array
        int k = 0;      // pointer for merged array

        // Compare elements from both arrays and pick the smaller one
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        // Return the fully merged and sorted array
        return mix;
    }
}
