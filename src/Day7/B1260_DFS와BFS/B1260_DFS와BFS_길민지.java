package Day7.B1260_DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260_DFS와BFS_길민지 {
	static int N, M, V;
	static ArrayList <Integer> graph[];
	static boolean isVisited[];
	
	static Queue <Integer>que = new ArrayDeque();
	
	static void DFS(int v) {
		if (isVisited[v]==false) { // 방문하지 않았다면 출력하고 방문 처리
			System.out.print(v + " ");
			isVisited[v] = true;
		}
		for (int i=0; i<graph[v].size();i++) { // 자식 탐색
			if (isVisited[graph[v].get(i)]==true) continue;
			DFS(graph[v].get(i));
		}
	}
	
	static void BFS(int root) {
		que.add(root); // 루트 노드 삽입
		isVisited[root] = true;
		while (!que.isEmpty()) {
			int node = que.poll(); // Dequeue
			System.out.print(node+" ");
			for (int i=0; i<graph[node].size();i++) { // 자식 탐색
				if (isVisited[graph[node].get(i)]==true) continue;
				que.add(graph[node].get(i)); // 자식 Enqueue
				isVisited[graph[node].get(i)] = true;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		// 그래프 초기화
		graph = new ArrayList[N+1];
		for (int i=0; i<N+1; i++) graph[i] = new ArrayList <Integer>();
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(bf.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			graph[v1].add(v2);
			graph[v2].add(v1);
		}
		for (int i=0; i<N+1; i++) Collections.sort(graph[i]);
		
		isVisited = new boolean[N+1];
		
		DFS(V);
		System.out.println();
		
		// isVisited 초기화
		for (int i=0; i<N+1; i++) isVisited[i] = false;
		BFS(V);
	}

}
