package code;

import java.util.Scanner;

public class StringEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ur name: ");
        String naam = in.next();
        String personalized = myGreet(naam);
        System.out.println(personalized);

        String message = greet();
        System.out.println(message);

    }
    static String myGreet(String name){
        String msg = "Hello " + name;
        return msg;
    }

    static String greet(){
        String greeting = "How are you? ";
        return greeting;
    }
}
