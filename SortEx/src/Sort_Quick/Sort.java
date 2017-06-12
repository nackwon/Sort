package Sort_Quick;

public class Sort {
	public static void QuickSort(int[] data, int low, int high) {

		if (low < high) {
			int q = Partition(data, low, high);
			QuickSort(data, low, q - 1);
			QuickSort(data, q + 1, high);
		}

	}

	public static int Partition(int[] data, int low, int high) {

		int pivot = data[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (data[j] <= pivot) {
				i++;
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		int tmp = pivot;
		data[high] = data[i + 1];
		data[i + 1] = tmp;

		return i+1;
	}
}
