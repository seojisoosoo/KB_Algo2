package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260_DFS와BFS {
	static boolean[] isVisited;
	static ArrayList<Integer>[] graph;

	static void DFS(int startV) {
		isVisited[startV] = true;
		System.out.print(startV + " ");
		
		for(int nextNode : graph[startV]) {
			if(isVisited[nextNode]) continue;
			DFS(nextNode);
		}
		
	}
	
	static void BFS(int startV) {
		Queue <Integer> que = new ArrayDeque<>();
		que.add(startV);
		isVisited[startV] = true;
		while(!que.isEmpty()) {
			int nowNode = que.poll();
			
			System.out.print(nowNode + " ");
			
			for(int nextNode : graph[nowNode]) {
				if(isVisited[nextNode]) continue;
				isVisited[nextNode] = true;
				que.add(nextNode);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(token.nextToken()); // 정점의 개수
		int M = Integer.parseInt(token.nextToken()); // 간선의 개수(양방향)
		int V = Integer.parseInt(token.nextToken()); // 탐색 시작할 정점의 번호
		
		isVisited = new boolean[N+1];
		graph = new ArrayList[N+1];
		
		for(int i=0; i<N+1; i++) {		
			graph[i] = new ArrayList<>();
		}
		
		for(int i=0 ; i<M ; i++) {
			token = new StringTokenizer(bf.readLine());
			int u = Integer.parseInt(token.nextToken());
			int v = Integer.parseInt(token.nextToken());
			
			graph[u].add(v);
			graph[v].add(u);
		}
		for(int i=0; i<N+1; i++) {
			Collections.sort(graph[i]);
			//System.out.println(graph[i]);
		}
		
		DFS(V);
		System.out.println();
		isVisited = new boolean[N+1];
		BFS(V);
	}
}
