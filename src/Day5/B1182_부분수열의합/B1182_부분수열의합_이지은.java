package Day5.B1182_부분수열의합;

/**
 * 작성자: 이지은
 * 문제: N개의 정수로 이루어진 수열이 있을 때, 크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이 S가 되는 경우의 수를 구하는 프로그램을 작성하시오.
 * 입력: 첫째 줄에 정수의 개수를 나타내는 N과 정수 S가 주어진다. (1 ≤ N ≤ 20, |S| ≤ 1,000,000)
 *      둘째 줄에 N개의 정수가 빈 칸을 사이에 두고 주어진다. 주어지는 정수의 절댓값은 100,000을 넘지 않는다.
 * 출력: 첫째 줄에 합이 S가 되는 부분수열의 개수를 출력한다.
 * 
 * 부분집합을 이용 
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1182_부분수열의합_이지은 {
	static int N, S;
	static int [] arr;
	static boolean [] isSelected;
	static int sum; //부분집합의 합 
	static int cnt; //합이 S가 되는 부분수열의 개수
	static boolean isCheck;  //공집합 체크할 
	
	public static void subSet(int r) {
		if(r == N) {
			sum = 0;
			isCheck = false;
			for(int i=0; i<N; i++) {
				if(isSelected[i]) {
					isCheck = true;
					sum += arr[i];
				}
			}
			if(isCheck && sum==S) cnt++;
			return;
		}
		
		isSelected[r] = true;
		subSet(r+1);
		
		isSelected[r] = false;
		subSet(r+1);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//boolean 배열 초기화 
		isSelected = new boolean[N];
		
		subSet(0);
		
		System.out.println(cnt);

	}
}
