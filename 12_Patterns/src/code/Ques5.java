package code;
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
public class Ques5 {
    public static void main(String[] args) {
        //pattern(5);
        // OR

        int n = 9;
        for (int row = 1; row <= n/2+1; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n/2+2; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern(int m){
        for (int row = 0; row < 2 * m; row++) {
            int totalColsInRow = row > m ? 2 * m - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
