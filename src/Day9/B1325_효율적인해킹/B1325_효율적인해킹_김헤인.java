package Day9.B1325_ȿ��������ŷ;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1325_ȿ��������ŷ_������ {
	static int n, m; // n=��ǻ�� ����, m=������ �� 
	static int count;  //����
	static int max;  //arr�� ������ ���� ���� max
	static int[] arr; //��ŷ�Ҽ��ִ� ���� �޴� �迭
	static boolean[] isvisited;
	public static List<Integer>[] list;

	public static void searchBFS(int start) { //�ð����̱� ���� bfs
		boolean[] isvisited = new boolean[n+1];
		Queue<Integer> que = new LinkedList<>();
		isvisited[start] = true;
		que.add(start);
		
		
		while (!que.isEmpty()) { //ť�� �ƹ��͵� ������������ �ݺ�
			int nowNode = que.poll();  //����
			for (int nextNode : list[nowNode]) {
				if (isvisited[nextNode] == true)
					continue;
					arr[nextNode]++;  //��ŷ�Ҽ��ִ� ���� ����������
					isvisited[nextNode] = true;
					que.add(nextNode);
			}
		}
	}

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());  //�Է�
		m = Integer.parseInt(st.nextToken());
		list = new ArrayList[n+1];
		
		
		//���� ����Ʈ �����
		for(int i =0; i<=n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		//����Ʈ�� �ŷڵǴ� ��ǻ�� �ֱ�
		for(int i=0; i<m; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());  //�Է� �ޱ�
			int b = Integer.parseInt(st.nextToken());  //�Է� �ޱ�
			list[a].add(b);							   //���� ����Ʈ�� �ŷ� ��ǻ�� ��ȣ �ֱ�
		//list[b].add(a);	
		}
		

		arr = new int[n+1];
		//1�� ��ǻ�ͺ��� ã��
		for(int i=1; i<n+1; i++) {
			isvisited = new boolean [n+1];
			searchBFS(i);
		}
		
		
		//max�� ã��
		ArrayList<Integer> answer = new ArrayList<>();
		int max = 0;
		for(int i =0; i<n+1; i++) {
			if(max < arr[i]) {
				max = arr[i];
				answer.clear();
				answer.add(i);
			}else if(arr[i]==max) {
				answer.add(i);
			}
		}
			//���
		   for(int a:answer){
	            System.out.print(a+" ");
	        }
	}

}
