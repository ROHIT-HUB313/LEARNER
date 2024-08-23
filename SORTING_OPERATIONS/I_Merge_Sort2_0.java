package algorithms;

public class I_Merge_Sort2_0 {
	// Method to merge two halves
	private void merge(int[] array, int start, int mid, int end) {
		// Calculate the lengths of the two halves
		int leftLength = mid - start + 1;
		int rightLength = end - mid;

		// Create temporary arrays
		int[] left = new int[leftLength];
		int[] right = new int[rightLength];

		// Copy data to temp arrays
		System.arraycopy(array, start, left, 0, leftLength);
		System.arraycopy(array, mid + 1, right, 0, rightLength);

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array
		int k = start;

		// Merge the temporary arrays back into the original array
		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}

		// Copy remaining elements of left[], if any
		while (i < leftLength) {
			array[k++] = left[i++];
		}

		// Copy remaining elements of right[], if any
		while (j < rightLength) {
			array[k++] = right[j++];
		}
	}

	// Recursive method to divide and sort
	public void mergeSort(int[] array, int start, int end) {
		if (start < end) {
			// Find the middle point
			int mid = start + (end - start) / 2;

			// Sort first and second halves
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);

			// Merge the sorted halves
			merge(array, start, mid, end);
		}
	}

	public static void main(String[] args) {
		I_Merge_Sort2_0 sorter = new I_Merge_Sort2_0();
		int[] array = { 38, 27, 43, 3, 9, 82, 10 };

		System.out.println("Before sorting:");
		for (int num : array) {
			System.out.print(num + " ");
		}

		sorter.mergeSort(array, 0, array.length - 1);

		System.out.println("\nAfter sorting:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
