package code;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
    // This code is calculating the number of digits required to represent n in base b
    // It tells us how many bits are needed to represent the number in binary.
}
