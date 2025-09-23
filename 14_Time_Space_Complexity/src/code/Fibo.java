package code;

public class Fibo {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormula(i));
        }
        System.out.println();
        System.out.println("15th fibonacci: " + fiboFormula(15));
        System.out.println(fiboFormula(50));
    }
    static long fiboFormula(int n){
        // base condition
        if (n < 2) {
            return n;
        }
        // long or int
        return (long)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }
}
