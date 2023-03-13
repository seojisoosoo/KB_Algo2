package Day3.B2750_»ğÀÔÁ¤·Ä;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750_»ğÀÔÁ¤·Ä_±èÇıÀÎ {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static void InsertionSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			int idx=i-1;
			int temp = arr[i];
				while(idx>=0 && temp<arr[idx]) {
					arr[idx+1] = arr[idx];
					idx--;
				}
				arr[idx+1] = temp;
			}
		}
	
	
	public static void main(String[] args) throws IOException {
		/* ÀÔ·Â Ã³¸® */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		// Á¤·Ä
		InsertionSort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}