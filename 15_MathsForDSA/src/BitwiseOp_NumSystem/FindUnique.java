package BitwiseOp_NumSystem;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 6, 2, 4};
        System.out.println(ans(arr));
    }
    private static int ans(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique ^= n;     // XOR
        }
        return unique;
    }
}
