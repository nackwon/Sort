package Sort_Merge;

public class Sort {
	public static int[] sorted = new int[20];

	public static void mergeSort(int data[], int m, int n) {
		int middle;

		if (m < n) {
			middle = (m + n) / 2;
			mergeSort(data, m, middle); // �� �κ�(���)
			mergeSort(data, middle + 1, n); // �� �κ�(���)
			merge(data, m, n, middle); // ���ĵ� ��, �� �κ� �պ�
		}
	}

	public static void merge(int data[], int m, int n, int middle) {

		int k, i, j;

		i = m;
		j = middle + 1;
		k = m;
		while (i <= middle && j <= n) { // 

			if (data[i] <= data[j])
				sorted[k++] = data[i++];
			else
				sorted[k++] = data[j++];
		}

		if (i > middle) {
			for (int t = j; t <= n; t++)
				sorted[k++] = data[t];
		} else
			for (int t = i; t <= middle; t++)
				sorted[k++] = data[t];

		for (int t = m; t <= n; t++)
			data[t] = sorted[t];

	}
}
