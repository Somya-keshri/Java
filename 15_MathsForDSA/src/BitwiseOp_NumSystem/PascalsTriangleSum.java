package BitwiseOp_NumSystem;

public class PascalsTriangleSum {
    public static void main(String[] args) {
        int n = 5;

        //Formula: Sum of nth row of Pascal's Triangle = 2^(n-1)
        // Example: Row 5 → 1 4 6 4 1 → sum = 16 → 2^(5-1) = 16

        int sum = 1 << (n-1);   // left shift
        System.out.println("Sum of " + n + "th row in Pascals Triangle = " + sum);
    }
}
