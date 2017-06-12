package Sort_Insertion;

public class Sort {

	public static void InsertionSort(int[] data) {

		for (int i = 1; i < data.length - 1; i++) {
			int key = data[i];
			int j = i - 1;

			while (j >= 0 && data[j] > key) {
				data[j + 1] = data[j];
				j = j - 1;
			}
			data[j + 1] = key;
		}
	}
}
