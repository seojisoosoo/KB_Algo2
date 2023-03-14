package Day4.B2961_도영이가만든맛있는음식;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2961_도영이가만든맛있는음식_박예린 {

	static int N, S, B;
	static int [] arrSour;
	static int [] arrBitter;
	static int res;

	static int cnt = 0;
	static boolean [] isSelected;
	static StringBuilder stringBuilder = new StringBuilder();

	static void subset(int [] arr1, int [] arr2, int num) {
		// 종료 조건
		if(num == N) {
			cnt++;
			S = 1;
			B = 0;
			
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));

			for(int i = 0; i < N; i++) {
				if(isSelected[i]) {
					System.out.print(arr1[i] + " ");
					System.out.print(arr2[i] + " ");

					S *= arr1[i];
					B += arr2[i];
				}				
			}
			System.out.println(res);
			System.out.println(S);
			System.out.println(B);
			if(Math.abs(S-B) < res) res = Math.abs(S-B);
			
			System.out.println();
			return;
		}
		
		isSelected[num] = true;
		subset(arr1, arr2, num+1);

		isSelected[num] = false;
		subset(arr1, arr2, num+1);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(bf.readLine());
		
		arrSour = new int[N];
		arrBitter = new int[N];
		res = 100;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine()); // 여기에 써야 함!!!!!!!!!!
			arrSour[i] = Integer.parseInt(st.nextToken());
			arrBitter[i] = Integer.parseInt(st.nextToken());
		}
		
		isSelected = new boolean[N];
		
		subset(arrSour,arrBitter, 0);
		System.out.println(res);
		
		System.out.print(stringBuilder.toString());	
	}
}