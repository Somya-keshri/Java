package code.strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("", "12");

        ArrayList<String> ans = new ArrayList<>(padRet("", "12"));
        System.out.println(ans);
        // OR
        System.out.println(padRet("", "12"));

        System.out.println(padRet("", "12").size());
        // OR
        System.out.println(padCount("", "12"));
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        // Take the first character (which is a digit like '2', '3', etc.)
        // Subtracting '0' converts it from a character to its integer value.
        int digit = up.charAt(0) - '0';   // Convert '2' → 2

        // Each digit corresponds to 3 letters (like on an old phone keypad)
        // '2' → a, b, c
        // '3' → d, e, f
        // '4' → g, h, i
        // and so on...
        // formula (digit - 1) * 3 gives the starting letter’s index
        // digit * 3 gives ending letter index (exclusive)

        for(int i = (digit-1) * 3; i < digit * 3; i++){
            // Convert number to actual character (letter)
            char ch = (char) ('a' + i);

            // Add the current character to the processed part (p + ch)
            // and move on to the next digit (up.substring(1))
            pad(p+ch, up.substring(1));    // Recursive call
        }
    }

    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';

        // This list will store all combinations generated for this level
        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit-1) * 3; i < digit * 3; i++){
            char ch = (char) ('a'+i);
            list.addAll(padRet(p+ch, up.substring(1)));
        }
        // Return the full list of combinations collected
        return list;
    }

    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;    // this will store total combinations from all recursive calls
        // Convert the first character (a digit character like '2', '3', etc.) to an integer.
        int digit = up.charAt(0) - '0';

        for (int i = (digit-1) * 3; i < digit * 3; i++){
            char ch = (char) ('a'+i);
            count = count + padCount(p+ch, up.substring(1));
        }
        return count;
    }
}
