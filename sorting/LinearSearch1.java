package sorting;

public class LinearSearch1 {

    static boolean linearSearchUnsorted(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] myArr = { 4, 2, 9, 1, 0, 10, 3 };
        System.out.println(linearSearchUnsorted(myArr, 12));
    }
}