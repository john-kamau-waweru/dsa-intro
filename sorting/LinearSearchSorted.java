package sorting;

public class LinearSearchSorted {
    static boolean lss(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return true;
            } else if (value < arr[i]) {
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] myArr = { 20, 12, 9, 6, 3, 1 };

        System.out.println(lss(myArr, 20));
    }
}
