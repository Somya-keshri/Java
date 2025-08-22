package questions;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 9, 13, 71};
        int target = 7;

        FirstAndLastPosition obj = new FirstAndLastPosition();
        int[] ans = obj.searchRange(nums, target);

        // Print result
        System.out.println("First and Last Position: " + Arrays.toString(ans));
    }
    public int[] searchRange(int[] nums, int target){
        int[] ans = {-1, -1};
        // check for first occurrence if target first
        int start = search(nums, target, true);         // find first (leftmost)
        int end = search(nums, target, false);          // find last (rightmost)

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;              // default “not found”
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;       // overflow-safe mid

            if(target < nums[mid]){
                end = mid - 1;                    // go left
            } else if (target > nums[mid]) {
                start = mid + 1;                  // go right
            }
            else{
                // potential answer found
                ans = mid;                // found a target at mid
                if(findStartIndex){
                    end = mid - 1;          // keep looking LEFT for first
                }
                else {
                    start = mid + 1;       // keep looking RIGHT for last
                }
            }
        }
        return ans;                 // boundary if found; -1 otherwise
    }
}
