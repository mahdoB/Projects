package algorithms.sorts;

/**
 * @author ibnrochd
 *
 */
public class BubbleSort {

	private static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
			}
		}
	}

	private static void bubbleSortEnhanced(int[] array) {
		boolean swap = true;
		for (int i = 0; i < array.length - 1; i++) {
			swap = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
					swap = true;
				}
			}
			if (!swap) {
				break;
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
	}

	public static void main(String args[]) {
		int array[] = { 29, 39, 22, 16, 4, 88, 44 };

		System.out.println("Before:");
		displayArray(array);

		bubbleSortEnhanced(array);

		System.out.println("After:");
		displayArray(array);

	}
}
