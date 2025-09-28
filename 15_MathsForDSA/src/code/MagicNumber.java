package code;

public class MagicNumber {
    // This program generates a magic number sequence where binary digits are mapped to powers of 5 instead of powers of 2.
    public static void main(String[] args) {
        int n = 7;    // 111  binary form
        int ans = 0;
        int base = 5;

        while(n > 0){
            int last = n & 1;     // if n is odd -> last = 1, else 0
            // If the bit is 1, then the corresponding power of 5 is added to the result. If the bit is 0, nothing is added.

            // shift n right by 1 (basically divide by 2, discard last bit)
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
        // 5^3 + 5^2 + 5^1 = 125+25+5 = 155  (7)
        // 1, 10,  11,  100,  101,  110,  111
        // 5, 25, 25+5, 125, 125+5, 125+25, 125+25+5
        // 5  25   30   125   130    150    155
    }
}
