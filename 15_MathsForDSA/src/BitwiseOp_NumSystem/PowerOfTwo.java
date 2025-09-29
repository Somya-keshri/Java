package BitwiseOp_NumSystem;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        boolean ans;
        if(n == 0){
            ans = false;     // 0 is not a power of 2
        }
        else {
            ans = (n & (n - 1)) == 0;
        }
        System.out.println(ans);
    }
}
