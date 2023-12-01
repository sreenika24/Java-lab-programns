public class MaxElementInArray {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        int maxNum = findMax(numbers);
        System.out.println("Maximum Element: " + maxNum);
    }
}
