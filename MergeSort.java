public class MergeSort {

	private int[] array;
	private int[] tmp;
	private int length;

	public static void main(String[] args) {
		int[] input = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		MergeSort ms = new MergeSort();
		ms.sort(input);
		for (int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

	public void sort(int[] input) {
		this.array = input;
		this.length = input.length;
		this.tmp = new int[length];
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tmp[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tmp[i] <= tmp[j]) {
				array[k] = tmp[i];
				i++;
			} else {
				array[k] = tmp[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tmp[i];
			k++;
			i++;
		}
	}
}