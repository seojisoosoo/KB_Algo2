package Day3.B2750_선택정렬;

import java.util.Scanner;

public class B2750_선택정렬_Sol {
	
	static void swap(int [] arr , int i , int j ) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void selectSort(int [] arr) {
		
		int N = arr.length;
		
		for(int i=0; i<N-1; i++) {
			int minIdx = i;
			
			for(int j=i; j<N; j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			swap(arr , i ,minIdx);
		}
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		for(int i=0; i<N; i++) arr[i] = sc.nextInt();
		
		selectSort(arr);
		
		for(int i=0; i<N; i++) System.out.println(arr[i]);

	}
}
