package code;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Find the largest of 3
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max + " is largest");

        // OR
//        int m = 0;
//        if(a > b){
//            m = a;
//        } else {
//            m = b;
//        }
//        if(c > m){
//            m = c;
//        }
//        System.out.println(m + " is largest");

        // OR
//        if(a>b && a>c){
//            System.out.println(a + " is largest");
//        }
//        else if(b>a && b>c){
//            System.out.println(b + " is largest");
//        }
//        else{
//            System.out.println(c + " is largest");
//        }

        int largest = Math.max(c, Math.max(a, b));
        System.out.println(largest);
//        System.out.println(Math.max(35, 55));
    }
}
