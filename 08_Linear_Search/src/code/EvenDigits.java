package code;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {25, 347, 12, 30, 2, 9417};
        System.out.println(findNum(nums));
        System.out.println(digits2(21657));
    }
    static int findNum(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check whether a number contains even digits or not
    static boolean even(int num){
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }

    // count number of digits in a number
    static int digits2(int num){            // more faster
        return (int)(Math.log10(num)) + 1;
    }
    // OR
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
