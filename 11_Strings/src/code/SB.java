package code;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());     // abcdefghijklmnopqrstuvwxyz
        // this is not creating new object it's only changing in this original object that was created
        // So it is mutable

        builder.deleteCharAt(0);
        builder.delete(4, 11);
        System.out.println(builder);

        builder.append("k213");
        System.out.println(builder);      // bcdemnopqrstuvwxyzk213
        builder.reverse();
        System.out.println(builder);
    }
}