package questions;

public class Smallest_letter {
    public static void main(String[] args) {
        char[] letters = {'a', 'f', 'i', 'o', 'p'};
        char target = 'c';
        int index = nextGreatestLetter(letters, target);
        System.out.println("index: " + index);
        System.out.println("Next Greatest num = " + letters[index]);
    }
    static int nextGreatestLetter (char[] letters, char target){

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start % letters.length;
    }
}
