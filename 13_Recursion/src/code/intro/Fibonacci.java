package code.intro;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
    static int fibo(int n){
        // base condition
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
// like fibo(2) coming many times.. it is solved later using dynamic programming

// Types of recurrence relation
// 1. Linear   =>  eg: fibonacci
// 2. Divide & Conquer (problem is divided into smaller subproblems) => eg: binary search
