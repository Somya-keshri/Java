package code;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 4},
                {2, 1},
                {1, 3}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when u start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum +=  accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
