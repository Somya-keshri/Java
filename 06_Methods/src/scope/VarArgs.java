package scope;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 8, 8, 9, 6, 3);
        str("ghf", "gyd", "kjw");
        multiple(2, 3, "Jaipur", "Jodhpur");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void str(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        // variable length argument always at the end
        System.out.println(Arrays.toString(v));

        // how could I print a & b
    }
}
