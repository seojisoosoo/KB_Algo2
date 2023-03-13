package Day3;

import java.util.Scanner;

public class B2750_버블정렬_김혜인 {


	public static void swap(int []arr, int i, int j) {
		//밑에꺼 대신에 편하게 쓴느거
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	
	}
	
	public static void bubbleSort(int [] arr) {
		for(int i = 0 ; i<arr.length-1 ; i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
				swap(arr, j, j+1);
				}
			}
		}
}
	public static void main(String[] args) throws NumberFormatException {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr =  new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
