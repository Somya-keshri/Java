package code;

public class Comparison {
    public static void main(String[] args) {
        String a = "Tom";
        String b = "Tom";
        String c = a;    // another reference to the same heap object
        System.out.println(c == a);     // true
        System.out.println(a == b);     // true

        String name1 = new String("Jerry");
        String name2 = new String("Jerry");
        String p = name2;
        System.out.println(p);       // // Jerry

        System.out.println(name1 == name2);    // false
        System.out.println(name1.equals(name2));     // true

        String n1 = new String("Oggy");
        String n2 = new String("Oggy  ");

        System.out.println(n1 == n2);       // false
        System.out.println(n1.equals(n2));      // false

        String x = new String("Hello");
        String y = x.intern();       // redirects y to the pool object
        System.out.println(y);       // Hello
    }
}
