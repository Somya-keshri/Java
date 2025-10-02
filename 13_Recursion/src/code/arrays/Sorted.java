package code.arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 14, 35, 25};
        System.out.println(sorted(arr, 0));

    }
    static boolean sorted(int[] arr, int index){
        // base condition
        if(index == arr.length - 1){     // check last index
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}
