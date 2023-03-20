package B1260_DFS��BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
 
public class B1260{
	
	static int[][] arr;
	static boolean[] isvisited = new boolean[1001]; // �Է� ���̽� = 1000
	
	static int N, M, V;
	
	static Queue<Integer> q = new LinkedList<>();    
	static StringBuilder st = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] token = br.readLine().split(" ");
		N = Integer.parseInt(token[0]);	//������
		M = Integer.parseInt(token[1]);	//������
		V = Integer.parseInt(token[2]);	//Ž������ ����	

		arr = new int[N+1][N+1];
		
		for (int i = 0; i < M; i++) {
			token = br.readLine().split(" ");
			int node1 = Integer.parseInt(token[0]);
			int node2 = Integer.parseInt(token[1]);
			
			//����(�����) �׷���
			arr[node1][node2] = 1;
			arr[node2][node1] = 1;
		}
		
		dfs(V);
		st.append("\n");
		Arrays.fill(isvisited, false);		//�湮�迭 �ʱ�ȭ
		
		bfs(V);
		System.out.println(st);
		st.setLength(0);
	
}
//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= N; j++) {
//				System.out.print(graph[i][j]);
//			}
//			System.out.println();
//		}
		
	
	private static void dfs(int v) {		//v : 1
		
		//������ ���� �湮 ����
		isvisited[v] = true;
		st.append(v).append(" ");
		//recursive
		for (int i = 1; i <= N; i++) {
			if(arr[v][i] == 1 && !isvisited[i]) { // ���� ���� �ְ� + �湮 ������ �� ���
				dfs(i);
			}
		}
	}//dfs

	static void bfs(int v) {
		
		q.add(v);
		isvisited[v] = true;  // ���۰��ֱ�
		
		while(!q.isEmpty()) {
			
			v = q.poll();
			st.append(v).append(" ");
			
			// 2���� �迭���� �� ���� (�� ��ü�� ����) >> 1~n���� �� �� �ֱ�(���η�)
			for (int i = 1; i <= N; i++) {
				if(arr[v][i] == 1 && !isvisited[i]) {
					q.add(i);			
					isvisited[i] = true;
				}
			}
		}
		q.clear();
	}


}