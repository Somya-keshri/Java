package code;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfPrimitives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
        System.out.println(arr[3]);

        // input using for loops
        int[] arry = new int[5];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = in.nextInt();
        }
        System.out.println("Method_1 ");
        System.out.println(Arrays.toString(arry));    // Eg: [8, 2, 4, 3, 4]

        System.out.println("Method_2 ");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");         // 8 2 4 3 4
        }

        System.out.println();
        System.out.println("Method_3 ");
        for(int num : arry) { // for every element in array, print the element
            System.out.print(num + " "); //  here num represents element of the array
        }
//        System.out.println(arr[5]); // index out of bound error, exist till index 4 int[5]
    }
}
