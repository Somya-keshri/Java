package code;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.print(ch + " ");
            series = series + ch; // series += ch   Concatenates the character to the string series
        }
        System.out.println();
        System.out.println(series);      // abcdefghijklmnopqrstuvwxyz
    }
}