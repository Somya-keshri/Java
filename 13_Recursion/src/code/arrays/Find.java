package code.arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {12, 52, 32, 27, 98, 27, 64, 12};

        System.out.println(find(arr, 98, 0));
        System.out.println("index: " + findIndex(arr, 32, 0));
        System.out.println("indexFromLast: " + findIndexLast(arr, 32, arr.length-1));

        findAllIndex1(arr, 12, 0);
        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex2(arr, 27, 0, list);
        System.out.println(ans);
        System.out.println(list);

        System.out.println(findAllIndex3(arr, 12, 0));
    }

    static boolean find(int[] arr, int target, int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            // return position from last instead of normal index
            return arr.length - index;
        }
        else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex1(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);      // add to the shared static list
        }
        findAllIndex1(arr, target, index + 1);   // recursive call
    }
    // Uses static global variable.


    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);    // add index to current list
        }
        return findAllIndex2(arr, target, index + 1, list);    // pass list forward
    }
    // Uses parameter + return value.. better practice in most cases


    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
