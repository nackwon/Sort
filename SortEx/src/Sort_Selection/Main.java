package Sort_Selection;

public class Main {
	
	public static void SelectionSort(int[] data){
		
		int temp;
		
		for(int i=0;i<data.length-1;i++){
		
			int index = i; 
			
			for(int j=i+1;j<data.length;j++){ // �迭 �ȿ� ���� ���� �� ã��
				if(data[j] < data[index])
					index = j;
			}
			
			// swap
			temp = data[i];
			data[i] = data[index];
			data[index] = temp;
		}
	}
}
