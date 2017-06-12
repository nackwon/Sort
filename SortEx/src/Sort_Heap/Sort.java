package Sort_Heap;

public class Sort {

	public static void HeapSort(int data[]) {

		int n = data.length;

		for (int i = n / 2 - 1; i >= 0; i--)
			MaxHeapify(data, n, i);

		for (int i = n - 1; i >= 0; i--) {
			int tmp = data[0];
			data[0] = data[i];
			data[i] = tmp;

			MaxHeapify(data, i, 0);
		}
	}

	public static void MaxHeapify(int[] data, int n, int i) {

		int largest = i; // 제일 큰 값
		int left = 2 * i + 1; // 왼쪽 자식
		int right = 2 * i + 2; // 오른쪽 자식

		// 만약 왼쪽자식이 제일 큰 값보다 크면 
		if (left < n && data[left] > data[largest])
			largest = left;
		if (right < n && data[right] > data[largest])
			largest = right;
		if (largest != i) {
			int swap = data[i];
			data[i] = data[largest];
			data[largest] = swap;

			MaxHeapify(data, n, largest);
		}
	}
}
