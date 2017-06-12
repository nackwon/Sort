package Sort_Merge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] merge = new int[n];

		for (int i = 0; i < merge.length; i++) {
			merge[i] = sc.nextInt();
		}
		Sort.mergeSort(merge, 0, merge.length - 1);

		for (int i = 0; i < merge.length; i++) {
			System.out.print(merge[i] + " ");
		}
	}

}
