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
		} // �Է� �ޱ�
		
		Main.SelectionSort(arr); // selection ȣ��
		
		for(int i=0;i<arr.length;i++){ // ���
			System.out.print(arr[i] + " ");
		}
		
	}

}
