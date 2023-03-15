package Day5.B1068_트리;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class B1068_트리_김태환 {

	static int N;
	static ArrayList<Integer> tree [];
	static boolean [] isVisited;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		tree = new ArrayList[N + 1];
		isVisited = new boolean [N+1];
	
	    for (int i = 0; i < tree.length; i++) {
	        tree[i] = new ArrayList<>();
	      }
		
		for(int i=1; i<=N; i++) {
//			int u = sc.nextInt();
			int v = sc.nextInt();
			tree[i].add(v);
//			tree[v].add(u);
		}
		
		for(int i=0; i<tree.length; i++) {
			System.out.println(i + " 노드 : " + tree[i]);
		}
		
//		for(int i=2;i<tree.length;i++) {
//			System.out.println(tree[i].get(0));
//		}
	}
}


		