package code;

public class Swap_04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap two num
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + "  " + b);

        swap(a, b);
        System.out.println(a + "  " + b);       // not change

        String name = "Somya";
        changeName(name);
        System.out.println(name);           // not change
//        System.out.println(naam);       // error
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void changeName(String naam){
        naam = "Srashti";
    }
}
