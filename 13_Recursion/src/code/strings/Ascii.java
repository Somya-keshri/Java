package code.strings;

public class Ascii {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch);
        System.out.println(ch + 2);    // converts the char into its integer ASCII value

        for (int i = 0; i < 7; i++) {
            System.out.print((char)(ch+i) + " ");    // converts it back to a character
        }
    }
}
