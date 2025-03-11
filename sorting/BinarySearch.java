package sorting;

public class BinarySearch {

    static boolean bs(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == value) {
                return true;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                high = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] myArr = { 20, 12, 9, 6, 3, 1 };
        System.out.println(bs(myArr, 10));
    }
}
