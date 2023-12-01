import java.util.Arrays;
public class CountingSort {
	
	public static void countingSort(int[] input, int k) {
		int counter[] = new int[k + 1];
		// fill bucket
		for(int i : input) {
			counter[i]++;
		}
		// sort array
		int ndx = 0;
		for(int i = 0; i < counter.length; i++) {
			while( 0 < counter[i]) {
				input[ndx++] = i;
				counter[i]--;
			}
		}
	}
	public static void main(String[] args) {
		int[] input = { 60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40 };
		int k = 60;
		System.out.println("Integer array before sorting: " + Arrays.toString(input));
		countingSort(input, k);
		System.out.println("Integer array after sorting: " + Arrays.toString(input));
	}
}