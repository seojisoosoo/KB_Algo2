package Day5.B11725_트리의부모찾기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B11725_트리의부모찾기_김태선 {

	static int N;
	static ArrayList<Integer> tree [];
	static boolean [] isVisited;
	static int [] parent;
	
	static void Search(int node) {
		for(int nextNode : tree[node]) {
			if(isVisited[nextNode]) continue;
			isVisited[nextNode] = true;
			Search(nextNode);
			parent[nextNode] = node;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		tree = new ArrayList[N + 1];
		isVisited = new boolean [N+1];
	
	        for (int i = 0; i < tree.length; i++) {
			tree[i] = new ArrayList<>();
	      	}
		
		for(int i=0; i<N-1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			tree[u].add(v);
			tree[v].add(u);
		}
		
		parent = new int [N+1];

		// RootNode 부터 탐색 //
		isVisited[1] = true;
		Search(1);
	
		for(int i=2; i<N+1; i++) System.out.println(parent[i]);

	}
}
