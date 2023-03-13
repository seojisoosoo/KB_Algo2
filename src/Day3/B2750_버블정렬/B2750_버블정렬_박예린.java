package Day3.B2750_버블정렬;

import java.util.Arrays;

public class B2750_버블정렬_박예린 {
	
	public static void swap(int [] arr, int i, int j) {
				
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}
	
	public static void bubbleSort(int [] arr) {
		
		int len = arr.length;
		

		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// 입력 처리 // 
		int [] arr = {4,5,9,2,6};

		// 정렬
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));


	}
}