package switch_case;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // alt + enter  => new syntax
        switch (fruit) {
            case "Mange" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}
