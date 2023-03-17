package Day7.B11724_�������ǰ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���Ḯ��Ʈ �׷����� �湮Ƚ���� ���� ��Ұ����� ���� > dfs�� ������ �� ���Ƽ� ����
public class B11724_�������ǰ���_������{
	
	
	static int[][] arr;
	static boolean[] isvisited;  // 
	static int count = 0; // �湮Ƚ�� ����
	static int N, M; // ������, ������
	
	
	public static void dfs(int v) {	
		//������ ���� �湮 ����
		isvisited[v] = true;
		//��� 
		for (int i = 1; i <= N; i++) {
			if(arr[v][i] == 1 && !isvisited[i]) dfs(i); // ���� ���� + �湮 ������ �� ���
			}
		}	
		
		
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
	     N = Integer.parseInt(st.nextToken());
	     M = Integer.parseInt(st.nextToken()); 
	     
	     arr = new int [1001][1001];   //��ǥ �״�� �޾Ƶ帲
	     isvisited = new boolean[1001]; //�켱 �ʱⰪ false�� ���� > Ž�� �� ���� 
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			int node2 = Integer.parseInt(st.nextToken());
			
			//�ʱⰪ 1�� �������� 
			arr[node1][node2] = 1;
			arr[node2][node1] = 1;
		}
		
		int count = 0;
		for(int a = 1; a<N+1; a++) {
			if(!isvisited[a]) {
				dfs(a);
				count++;
			}
		}
		
		System.out.println(count);
		}
	
	
}
	
 
			
	
 