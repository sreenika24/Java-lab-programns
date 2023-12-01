import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = arr[i];
            }
        }
        return Arrays.copyOf(result, index);
    }
    
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 5, 2, 7, 8, 5};
        int[] uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueNumbers));
    }
}
