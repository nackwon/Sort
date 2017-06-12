package Sort_Selection;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		} // 입력 받기
		
		Main.SelectionSort(arr); // selection 호출
		
		for(int i=0;i<arr.length;i++){ // 출력
			System.out.print(arr[i] + " ");
		}
		
	}

}
