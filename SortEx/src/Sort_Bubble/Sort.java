package Sort_Bubble;

public class Sort {

	public static void BubbleSort(int[] data) {

		for (int i = 0; i < data.length - 1; i++) {

			for (int j = 0; j < data.length - i - 1; j++) {
				if (data[j] > data[j+1]) {
					int tmp = data[j+1];
					data[j+1] = data[j];
					data[j] = tmp;
				}

			}
		}
	}
}
