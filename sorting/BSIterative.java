package sorting;

public class BSIterative {
    int binarySearch(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // check if x is present at mid
            if (arr[mid] == x) {
                return mid;
            }

            // if x greater, ignore left half
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BSIterative bsi = new BSIterative();
        int[] arr = { 2, 3, 4, 10, 50, 90 };
        int n = arr.length;
        int x = 10;
        int result = bsi.binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index: " + result);
        }
    }
}
