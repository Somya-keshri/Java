package code;

import java.util.Arrays;

public class PassingInFunc {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 10};
        System.out.println(Arrays.toString(nums));       // [3, 5, 2, 10]
        change(nums);
        System.out.println(Arrays.toString(nums));       // [3, 47, 2, 10]
    }
    static void change(int[] arr){
        arr[1] = 47;
    }
}
