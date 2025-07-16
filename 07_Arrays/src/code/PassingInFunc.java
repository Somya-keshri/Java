package code;

import java.util.Arrays;

public class PassingInFunc {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 10};
        System.out.println(Arrays.toString(nums));       // [3, 5, 2, 10]
        change(nums);
        System.out.println(Arrays.toString(nums));       // [3, 47, 2, 10]  (change the original array)
    }
    static void change(int[] arr){
        arr[1] = 47;
    }
    // String are immutable whereas Arrays are mutable in java
    // mutable basically means change the object
}
