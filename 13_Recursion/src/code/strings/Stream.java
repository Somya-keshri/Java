package code.strings;

public class Stream {
    public static void main(String[] args) {
        skip("", "appreciation");
        System.out.println(skip("Banana"));
        System.out.println(skipApple("this is an apple"));
        System.out.println(skipAppNotApple("this is an app not apple"));
    }

    //  Version 1: Print directly (void method)
    static void skip(String p, String up){
        // Base condition: if unprocessed string is empty
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        // If current character is 'a', skip it (don’t add to 'p')
        if(ch == 'a'){
            skip(p, up.substring(1));
        }
        // Otherwise, add current character to 'p' and continue
        else {
            skip(p + ch, up.substring(1));
        }
    }

    //  Version 2: Return processed string (instead of printing)
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        }
        else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
