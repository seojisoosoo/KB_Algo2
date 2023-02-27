<<<<<<< HEAD
package Day1;
=======
package BaekJoon.B11659_구간합구하기;
>>>>>>> 1612e89d705451f52f78146edfce37de4c7ca3f3

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11659_구간합구하기 {
	
	// 시간 초과
	public static void main(String[] args) throws IOException {
		
		System.setIn(new FileInputStream("B11659.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(reader.readLine() , " ");
		int N = Integer.parseInt(str.nextToken()); 
		int M = Integer.parseInt(str.nextToken());
		
		int [] arr = new int [N + 1];
		str = new StringTokenizer(reader.readLine() , " ");
		arr[0] =  0;
		
		for (int i = 0; i < N; i++) {	
			arr[i + 1] = Integer.parseInt(str.nextToken()) + arr[i];
		}
		
//		System.out.println(N + " " + M);
//		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < M; i++) {
			str = new StringTokenizer(reader.readLine() , " ");
			int start = Integer.parseInt(str.nextToken());
			int end = Integer.parseInt(str.nextToken());
			System.out.println(arr[end] - arr[start - 1]);
		}
	}
}
