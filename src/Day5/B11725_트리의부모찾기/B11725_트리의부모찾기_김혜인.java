package Day5.B11725_트리의부모찾기;

import java.util.ArrayList;
import java.util.Scanner;

public class B11725_트리의부모찾기_김혜인{

	static int N;
	static ArrayList<Integer> tree [];
	static boolean [] isVisited;
	static int[] parent;
	
	static void Parentnode(int node) {
		if(node==0) {
			return;
		}for(int i : tree[node]) {
		     if(!isVisited[i]) {       // 중복인 경우 skip
		    	 isVisited[i] = true;            // 중복 마킹
			     parent[i]= node;             
			     Parentnode(i);
		}
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		tree = new ArrayList[N + 1];
		isVisited = new boolean [N+1];
		parent = new int[N+1];
		
		
	    for (int i = 0; i < tree.length; i++) {
	        tree[i] = new ArrayList<>();
	      }
		
	    
		for(int i=0; i<N-1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			tree[u].add(v);
			tree[v].add(u);
		}
		
		/*
		for(int i=0; i<tree.length; i++) {
			System.out.println(i + " 노드 : " + tree[i]);
		}
		*/
		
		Parentnode(1);
																
		//부모 노드 출력
		for (int i=2;i<N+1;i++) {
			System.out.println(parent[i]);
		}
		
}			
}