package scope;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        random(95);
        System.out.println(a);
//        System.out.println(num);       // error
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
//        System.out.println(a);       // error
        // this change will only be valid in this func scope
    }
}
