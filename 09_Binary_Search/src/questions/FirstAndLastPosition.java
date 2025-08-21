package questions;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 9, 3, 6};
        int target = 7;

        FirstAndLastPosition obj = new FirstAndLastPosition();
        int[] ans = obj.searchRange(nums, target);

        // Print result
        System.out.println("First and Last Position: " + Arrays.toString(ans));
    }
    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        // check for first occurance if target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            }
            else{
                // potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
