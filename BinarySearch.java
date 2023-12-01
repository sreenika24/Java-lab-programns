public class BinarySearch {

    // Function to perform binary search in a sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at the middle
            if (arr[mid] == target)
                return mid;

            // If the target is greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;

            // If the target is smaller, ignore right half
            else
                right = mid - 1;
        }

        // Target not found in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 23;
        
        int result = binarySearch(sortedArray, target);
        
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
