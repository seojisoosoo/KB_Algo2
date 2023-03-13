package Day3.B2750_선택정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750_선택정렬_조성환 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int [] arr = new int [N];
		
		for(int i =  0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i = 0; i<N; i++) {
			for(int j = i + 1; j < N; j++) { 
				if(arr[i] > arr[j]) { 
					int temp = arr[i]; 
					arr[i] = arr[j]; 
					arr[j] = temp;  
				}
			}
		}

		for(int i =  0 ; i < N ; i++) {
			System.out.println(arr[i]);
		}
	}

}
