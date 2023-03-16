package Day6.B11047_동전0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B11047_동전0_조아영 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	//동전 종류
		int K = sc.nextInt();		//동전 합
		
		int [] coin  = new int[N];
	
		
		for(int i=0; i<N; i++) {
			coin[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int result = 0;
		int flag = 0;
		for(int i=coin.length-1; i>=0; i--) {
			if(coin[i]<K) {
				result = K / coin[i];
				cnt += result;				
				K = K % (coin[i] * result);
			}
		}
		
		System.out.println(cnt);
	}

}
