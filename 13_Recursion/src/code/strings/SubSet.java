package code.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
        for(List<Integer> list : ans){
            System.out.println(list);
        }

        System.out.println();

        int[] nums = {5, 7, 7};
        List<List<Integer>> answer = subsetDuplicate(nums);
        for(List<Integer> list : answer){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr){
        // This will store all subsets (each subset is a list of integers)
        List<List<Integer>> outer = new ArrayList<>();

        // Start with an empty subset: []
        outer.add(new ArrayList<>());

        // Loop through each number in the array
        for(int num : arr){
            int n = outer.size();   // current number of subsets in outer

            // For each existing subset, create a new subset that includes 'num'
            for(int i = 0 ; i < n; i++){
                // Make a copy of the existing subset
                List<Integer> internal = new ArrayList<>(outer.get(i));

                // Add the current number to this new subset
                internal.add(num);

                // Add this new subset to the list of all subsets
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);      // sort to group duplicates together
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());     // Start with empty subset

        int start = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++){
            start = 0;

            // If current element is same as previous → only extend subsets created in previous step (avoid duplicates)
            if(i>0 && arr[i] == arr[i-1]){
                start = end + 1;    // start only from where last new subsets began
            }

            end = outer.size() - 1;    // mark where current new subsets will end
            int n = outer.size();

            // Add current element to existing subsets
            for(int j = start; j < n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
