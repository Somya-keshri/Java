package code;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {7, 8, 63, 25, 15, 95, 31};
        int target = 95;
        System.out.println(LinearSearch(arr, target, 1, 6));
    }
    static int LinearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
