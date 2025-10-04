package code.patterns;

public class Triangle {
    public static void main(String[] args) {
        trianglerev(5, 0);
        triangle2(5, 0);
    }

    static void trianglerev(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("* ");
            trianglerev(row, col+1);
        }
        else {
            System.out.println();
            trianglerev(row-1, 0);
        }
    }

    static void triangle2(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            triangle2(row, col+1);
            System.out.print("* ");
        }
        else {
            triangle2(row-1, 0);
            System.out.println();
        }
    }
}
