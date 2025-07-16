package code;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(654);
        list.add(53);
        list.add(7);
        list.add(95);
        list.add(36);
        list.add(12);
        list.add(81);

        System.out.println(list);
        System.out.println(list.contains(95));
        list.set(0, 31);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);

        // input
        for (int i = 0; i < 2; i++) {
            list.add(in.nextInt());
        }
//        for (int i = 0; i < 2; i++) {
//            System.out.println(list.get(i));  // pass index here, list[index] syntax will not work here
//
//        }
        System.out.println(list);
    }
}
