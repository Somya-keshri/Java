package code;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        //Integer num = new Integer(5);      // deprecated in Java (from Java 9)
        Integer num = Integer.valueOf(5);
        System.out.println(num.toString());
        System.out.println(num);
        System.out.println("Peter");
        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5}));

        String name = null;
        System.out.println(name);
    }
}
