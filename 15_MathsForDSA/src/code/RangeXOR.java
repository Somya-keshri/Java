package code;

import java.util.Scanner;

public class RangeXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        // Range xor for a, b = xor(b) ^ xor(a-1)
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);

        // OR
        int ans2 = 0;
        for(int i=a; i<=b; i++){
            ans2 ^= i;
        }
        System.out.println(ans2);
    }
    static int xor(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
            return a +1;
        }
        return 0;
    }
}
