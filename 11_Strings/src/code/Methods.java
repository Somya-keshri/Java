package code;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Makhan Chor";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);      // Strings are immutable so original one won't change

        System.out.println(name.indexOf('C'));
        System.out.println("     Kanha   ".strip());
        // removes all leading and trailing whitespace (spaces, tabs, newlines) from a string

        String bookName = "Think and Grow Rich";
        System.out.println(Arrays.toString(bookName.split(" ")));
    }
}