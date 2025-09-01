package sorting.bubble;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        bubbleSort(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}