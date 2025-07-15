package code;

import java.util.Arrays;

public class ChangeValue_05 {
    public static void main(String[] args) {
        // create an array
        int[] arr = {5, 6, 2, 8, 7};
        change(arr);
        System.out.println(Arrays.toString(arr));   // [9, 6, 2, 8, 7]
    }
    static void change(int[] nums){
        nums[0] = 9;     // modifying the obj
        // if u make a change to the obj via this ref variable, same obj will be changed
    }
}
