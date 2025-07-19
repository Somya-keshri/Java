package code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {15, 26, 7, 36, 94, 30, 14, 85, 57, 3};
        int target = 94;
        System.out.println(linearSearch(nums, target));
    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }
}
