package Day3.B2750_버블정렬;

import java.util.Arrays;
import java.util.Scanner;

//수 정렬하기
public class B2750_버블정렬_조아영 {

	public static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void bubblesort(int[] arr) {

		for (int i = arr.length - 1; i > 0; i--) { 	//i=4
			for (int j = 0; j < i; j++) { //i=4, j=0~3
				if (arr[j] > arr[j + 1]) {	//arr[0] >arr[1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
//		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {

		// 입력 처리
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// 정렬
		bubblesort(arr);

	}
}
