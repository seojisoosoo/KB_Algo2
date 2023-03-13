package DAY0313;

import java.util.Scanner;

/**
 * 작성자: 김혜인
 * 문제:N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오
 * 입력: 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
 *  	이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 출력: 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * */



public class B2750_버블정렬_김혜인2 {

	public static void swap(int []arr, int i, int j) {
		//밑에꺼 대신에 편하게 쓴느거
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		
	}
	public static void main(String[] args) throws NumberFormatException {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr =  new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0 ; i<arr.length-1 ; i++) {
			int last = 0;
			for(int j = 0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int tempValue = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tempValue;
					last = j-1;
				}
			
			}
		}
		for(int i = 0 ; i<N; i++) {
			System.out.println(arr[i]);
		}
	}

}
