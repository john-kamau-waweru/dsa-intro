package sorting;

public class BSRecursive {
    int bsrFunc(int[] arr, int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // if the element is present at the middle itself
            if (arr[mid] == value) {
                return mid;
            }

            // if element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > value) {
                return bsrFunc(arr, low, mid - 1, value);
            }

            return bsrFunc(arr, mid + 1, high, value);
        }

        return -1;
    }

    public static void main(String[] args) {
        BSRecursive bsr = new BSRecursive();

        int[] arr = { 3, 8, 30, 78, 98, 102 };
        int n = arr.length;
        int x = 78;
        int result = bsr.bsrFunc(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Elemet is not present in array");
        } else {
            System.out.println("Element is present at index: " + result);
        }

    }
}
