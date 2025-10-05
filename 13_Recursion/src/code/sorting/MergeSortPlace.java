package code.sorting;

import java.util.Arrays;

public class MergeSortPlace {
    public static void main(String[] args) {
        int[] arr = {5, 21, 13, 7, 15, 45};

        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    // Function to merge two sorted parts of the array
    private static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];

        int i = s;      // pointer for left part
        int j = m;      // pointer for right part
        int k = 0;      // pointer for mixed array

        // Compare elements and pick smaller one
        while (i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Copy the sorted elements back to the original array
        for(int l=0; l< mix.length; l++){
            arr[s+l] = mix[l];
        }
    }
}
