package Day8.B9663_NQueen;

import java.util.Scanner;

public class B9663_NQueen_이지은 {
	static int N;
	static int [] chess;
	static int cnt; //서로 공격할 수 없는 경우의 개수 
	static int check;
	
	static boolean isCheck(int num) {
		for(int i=0; i<num; i++) {
			//퀸이 존재할 수 있는 위치인지. 같은 열, 같은 행, 대각선  
			if(chess[num]==chess[i] || Math.abs(num-i)==Math.abs(chess[num]-chess[i])) {
				return false;
			}
		}	
		return true; 
	}
	
	static void dfs(int num) {
		if(num == N) {
			cnt++; 
			return;
		}
		
		for(int i=0; i<N; i++) {
			chess[num] = i;
			if(isCheck(num)) dfs(num+1);  //재귀 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		chess = new int[N];
		
		dfs(0);
		
		System.out.println(cnt);
		
		sc.close();
		
	}
}
