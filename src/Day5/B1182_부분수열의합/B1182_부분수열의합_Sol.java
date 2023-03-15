package Day5.B1182_부분수열의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1182_부분수열의합_Sol {
	static int [] arr;
	static int N;
	static int S;
	static int cnt;
	static boolean flag;

	static void subset(int n , int sum , boolean flag) {
		if(n==N) {
			if(sum == S && flag) cnt++;
			return;
		}
		subset(n+1 , sum + arr[n] , true);
		subset(n+1 , sum , flag);
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine() , " ");
		N = Integer.parseInt(token.nextToken());
		S = Integer.parseInt(token.nextToken());
		
		arr = new int [N];
		token = new StringTokenizer(bf.readLine() , " ");
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(token.nextToken());
		
		subset(0,0,false);
		System.out.println(cnt);
		
	}
}
