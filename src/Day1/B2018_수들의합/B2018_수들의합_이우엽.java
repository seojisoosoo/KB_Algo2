package Day1.B2018_수들의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2018_수들의합_이우엽 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); // 15
		
		int result = 0;
		for(int i = 1; i <= N; i++) {
			int sum = i;
			int end = i+1;
			for(int j = i+1; j <= end; j++) {
				System.out.println("i: " + i);
				System.out.println("j: " + j);
				System.out.println("end: " + end);
				// 조건을 만족하면 break
				if(sum == N) {
					System.out.println("15!!: " + sum);
					result++;
					System.out.println("==============");
					break;
				}
				if(sum > N) {
					break;
				}
				System.out.println("before sum: " + sum);
				sum += j;
				System.out.println("after sum: " + sum);
				end++;
			}
			System.out.println("--------------");
		}
		System.out.println(result);
		

	}

}
