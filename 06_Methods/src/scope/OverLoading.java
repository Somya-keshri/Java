package scope;

public class OverLoading {
    public static void main(String[] args) {
        fun(57);
//        fun("Daffy");
        int ans = sum(5, 9);
        System.out.println(ans);
    }
    static void fun(int a){
        System.out.println("first");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second");
        System.out.println(name);
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    //same return type but argument different
}
