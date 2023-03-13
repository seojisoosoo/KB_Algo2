package Day3.B2750_퀵정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2750_퀵정렬_김혜인 {

		public static void swap(int[] arr, int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		
	
		public static int partition(int[] arr, int left, int right) {
			int pivot = left;
			int l = left+1;
			int r = right;
			
			while(l <=r) { //left-right 엇갈리지 않은 동안 전진
				while ( l<=r && arr[l]<=arr[pivot]) {
					l++;
				}
				while ( l<=r && arr[r]>=arr[pivot] ) {
					r--;
				}
				
				//이 부분 다시 보기
				if(l>r) 
					swap(arr, r, pivot); //엇갈린경우, right가 left앞선 경우
				else 
					swap(arr, l, r); //left, right 찾은 경우
			}
			
			return r;
	}
		
		//재귀 부분(자기 함수를 한번 더 언급). 이부분 다시 보기
		public static void quickSort(int []arr, int left, int right) {
			//재귀에는 종료조건 필수
			if(left >=right ) return;
			
			int pivot = partition(arr, left, right);
			
			quickSort(arr, left, pivot-1);
			quickSort(arr, pivot+1, right);
			
		}
		
		
		public static void main(String[] args) throws IOException {
			/* 입력 처리 */
			
		
			int [] arr = {5,2,7,1,9,6,8};
			System.out.println(Arrays.toString(arr));
			quickSort(arr, 0 , arr.length-1);
			System.out.println(Arrays.toString(arr));
		}

}
