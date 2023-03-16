package Day6.B1920_수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920_수찾기_김태선 {
	
	public static int [] arr;

	public static int binarySearch(int target) {
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(target < arr[mid]) {
				high = mid - 1;
			}
			else if(target < arr[mid]) {
				low = mid + 1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int [] arr = new int [N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		
		System.out.println(sb);
		
	}
	
	
}

