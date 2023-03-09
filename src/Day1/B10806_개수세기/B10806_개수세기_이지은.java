package Day1.B10806_개수세기;

import java.util.Scanner;

public class B10806_개수세기_이지은 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //입력 받을 배열의 크기
		int [] arr = new int[N]; 
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int V = sc.nextInt(); //배열의 값과 비교할 V 입력
		
		int cnt = 0; //동일한 값의 개수
		
		for(int a: arr) {
			if(a == V) { //배열의 값과 입력받은 값이 동일할 때
				cnt++; 
			}
		}
		System.out.println(cnt); //결과 출력
	}
}
