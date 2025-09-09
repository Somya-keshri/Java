package code;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');           // 195
        System.out.println("a" + "b");          // ab
        System.out.println((char)('a' + 3));      // d
        System.out.println("a" + 'b');     // ab

        System.out.println("a" + 1);           // a1
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Horse" + new ArrayList<>());        // Horse[]
        Integer num = Integer.valueOf(51);
        System.out.println("Horse" + num);                     // Horse51
        System.out.println("Horse" + new Integer(56));     // Horse56 (showing error)

        String ans = num + " " + new ArrayList<>();
        System.out.println(ans);                 // 51 []
    }
}
