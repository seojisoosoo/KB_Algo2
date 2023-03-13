package Day3.B2750_버블정렬;

/**
 * 작성자:이지은
 * 문제: N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
 *      이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 출력: 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750_버블정렬_이지은 {
	public static void swap(int[] arr, int i, int j) {
		//int [] new_arr = arr.clone();  //기존 배열에 영향을 주지 않기 위해 clone()을 사용
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j-1]>arr[j]) {
					swap(arr, j-1, j);
				}else {
					continue;
				}
			}
		}
		for(int a: arr) {
			System.out.println(a);	
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		for(int i =0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
	
		//버블 정렬 
		bubbleSort(arr);
	}	
}
