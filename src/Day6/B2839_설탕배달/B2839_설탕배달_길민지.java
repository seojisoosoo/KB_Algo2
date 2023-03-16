package Day6.B2839_설탕배달;

import java.util.Scanner;

public class B2839_설탕배달_길민지 {
	static int N; 
	static int K1, K2; 
	static int cnt, remain;
	
	static void findCntMin() {
		int maxK1 = N/K1; // 쓸 수 있는 K1 봉지의 최댓값
		for (int i = maxK1; i>=0; i--) {
			remain = N;
			remain -= K1*i;
			cnt += i;
			cnt += (remain/K2);
			remain -= (remain/K2)*K2;
			if (remain==0) break;
			cnt = 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력
		N = sc.nextInt(); 
		K1 = 5; // 봉지1 무게
		K2 = 3; // 봉지2 무게
		
		// 최소 개수 찾기
		findCntMin();
		
		// 출력
		if (remain == 0) System.out.println(cnt);
		else System.out.println(-1);
		sc.close();
	}
}

