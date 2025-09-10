package code;

public class Palindrome {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("abcdcba");

        // Make a reversed copy
        String original = word.toString();
        String reversed = new StringBuilder(word).reverse().toString();

        if(original.equals(reversed)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
