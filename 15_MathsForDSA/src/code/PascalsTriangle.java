package code;

public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5;

        // outer loop
        for (int i = 0; i < rows; i++) {
            // print spaces
            for (int k = 0; k < rows-i; k++) {
                System.out.print(" ");
            }

             int val = 1;
            // inner loop
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
