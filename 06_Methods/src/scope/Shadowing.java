package scope;

public class Shadowing {
    static int x = 90;  // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);   // 90
        int x = 40;        // class variable at line 4 is shadowed by this
        System.out.println(x);    // 40

        int y;   // declare
//        System.out.println(y);  // error scope will begin when value is initalized
        y = 50;    // initialise
        System.out.println("y = " + y);
        fun();
    }

    static void fun(){
        System.out.println(x);    // 90
    }
}
