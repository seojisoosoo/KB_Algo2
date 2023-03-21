package Day9.B1325_효율적인해킹;

/**
 * 작성자: 이지은
 * 문제: 해커 김지민은 잘 알려진 어느 회사를 해킹하려고 한다. 이 회사는 N개의 컴퓨터로 이루어져 있다. 김지민은 귀찮기 때문에, 한 번의 해킹으로 여러 개의 컴퓨터를 해킹 할 수 있는 컴퓨터를 해킹하려고 한다.
 *      이 회사의 컴퓨터는 신뢰하는 관계와, 신뢰하지 않는 관계로 이루어져 있는데, A가 B를 신뢰하는 경우에는 B를 해킹하면, A도 해킹할 수 있다는 소리다.
 *      이 회사의 컴퓨터의 신뢰하는 관계가 주어졌을 때, 한 번에 가장 많은 컴퓨터를 해킹할 수 있는 컴퓨터의 번호를 출력하는 프로그램을 작성하시오.
 * 
 * DFS 사용. 시간 단축 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1325_효율적인해킹_이지은 {
	static int N,M;
	static ArrayList <Integer> computer[];
	static boolean [] isCheck;
	static int max = 0;
	static int [] ans; //갯수를 담을 배열 
	
	static void dfs(int idx) {
		isCheck[idx] = true;
		
		for(int now : computer[idx]) {
			//방문하지 않고, 간선이 존재할 때 
			if(!isCheck[now]) {
				ans[now]++;
				dfs(now);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		computer = new ArrayList[N+1];
		
		for(int i =0; i<N+1; i++) computer[i] = new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			computer[a].add(b);
		}
		
		ans = new int[N+1];  
		for(int i=1; i<N+1; i++) {
			isCheck = new boolean[N+1];
			dfs(i);
		} 
		
		for(int i=1; i<N+1; i++) {
			if(max < ans[i]) max = ans[i];
		}
		
		for(int i=1; i<N+1; i++) {
			if(ans[i] == max) //최대값에 맞는 값의 인덱스만 출력하도록 
				System.out.print(i+" ");
		}
	}
}

