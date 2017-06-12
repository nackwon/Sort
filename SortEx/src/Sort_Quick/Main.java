package Sort_Quick;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		Sort.QuickSort(arr, 0, n-1);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
	}
}
