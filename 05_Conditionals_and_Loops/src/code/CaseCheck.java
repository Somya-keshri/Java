package code;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        } else {
            System.out.println("Upper case");
        }
//        System.out.println(ch);
    }
}
