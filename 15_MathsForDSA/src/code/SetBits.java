package code;

import java.util.Scanner;

public class SetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    private static int setBits(int n){
        int count = 0;
        // n & -n → extracts the rightmost set bit of n

        while(n > 0){
            count++;
            n -= (n & -n);     // remove the rightmost set bit
        }

        // OR
//        while(n > 0){
//            count++;
//            n = n & (n-1);
//        }
        return count;
    }
}
