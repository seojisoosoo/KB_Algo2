package Day1.B10806_개수세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10806_개수세기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		// 입력 처리 //
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt( bf.readLine());
		String s = bf.readLine();
		int [] arr = new int [N];
		StringTokenizer token = new StringTokenizer(s , " ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}
		int v = Integer.parseInt(bf.readLine());

        // v 찾아서 카운트 //
        int ans = 0;
		for(int i=0; i<N; i++) 
			if(arr[i] == v) ans++;
        System.out.println(ans);
	}
}
