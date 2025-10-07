package code.strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseqRet("", "abc"));

        subseqAscii("", "pq");
        System.out.println(subseqAsciiRet("", "pqr"));
    }

    // p → processed string , up → unprocessed string
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        // include the character
        subseq(p+ch, up.substring(1));
        // exclude the character
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // Include the current character
        ArrayList<String> left = subseqRet(p+ch, up.substring(1));
        // Exclude the current character
        ArrayList<String> right = subseqRet(p, up.substring(1));

        // Combine both results
        left.addAll(right);
        return left;    // or right
    }

    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseqAscii(p+ch, up.substring(1));     // include the character
        subseqAscii(p, up.substring(1));           // exclude the character
        subseqAscii(p+(ch+0)+" ", up.substring(1));    // include ASCII value of the character
    }

    static ArrayList<String> subseqAsciiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = subseqAsciiRet(p+ch, up.substring(1));      // include character
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));            // exclude character
        ArrayList<String> third = subseqAsciiRet(p+(ch+0), up.substring(1));    // include ASCII value

        first.addAll(second);    // merge results of second choice
        first.addAll(third);     // merge results of third choice

        return first;
    }
}
