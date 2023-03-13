package Day3.B2750_선택정렬;

import java.util.Scanner;

public class B2750_선택정렬_이채림 {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void selectionSort(int[] arr, int n) {
		int addr = 0, min = 0;
		
		for (int i = 0; i < n-2; i++) {
			min = arr[i];
			for (int j = i+1; j < n; j++) {
				if(min > arr[j]) {
					min = arr[j];
					addr = j;
				}
				} if(min != arr[i])
					swap(arr,i,addr);
				
			}
		}
	

	public static void main(String[] args) {
		// 입력처리
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		selectionSort(arr, N);
		for (int i : arr) {
			System.out.println(i);
		}

	}	

}
