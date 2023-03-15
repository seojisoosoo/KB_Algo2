package Day5.B11725_Ʈ���Ǻθ�ã��;

import java.util.ArrayList;
import java.util.Scanner;

public class B11725_Ʈ���Ǻθ�ã��_������{

	static int N;
	static ArrayList<Integer> tree [];
	static boolean [] isVisited;
	static int[] parent;
	
	static void Parentnode(int node) {
		if(node==0) {
			return;
		}for(int i : tree[node]) {
		     if(!isVisited[i]) {       // �ߺ��� ��� skip
		    	 isVisited[i] = true;            // �ߺ� ��ŷ
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
			System.out.println(i + " ��� : " + tree[i]);
		}
		*/
		
		Parentnode(1);
																
		//�θ� ��� ���
		for (int i=2;i<N+1;i++) {
			System.out.println(parent[i]);
		}
		
}			
}