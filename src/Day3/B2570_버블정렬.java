package Day3;

import java.util.Arrays;

public class B2570_버블정렬 {
	
	public static void swap(int [] arr, int i , int j) {
		int temp=arr[2];
		arr[2]=arr[4];
		arr[4]=temp;		
		int [] new_arr=arr.clone();
	}
	public static void bubbleSort() {
		
	}
	public static void main(String[] args) {
		int [] arr= {4,5,9,2,6};
		//index 2와 4 교환
//		int temp=arr[2];
//		arr[2]=arr[4];
//		arr[4]=temp;
		System.out.println(Arrays.toString(arr));
		
		swap(arr,2,4);
		bubbleSort();
		System.out.println(Arrays.toString(arr));
	}

}
