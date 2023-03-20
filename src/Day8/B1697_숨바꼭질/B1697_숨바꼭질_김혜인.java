package Day8.B1697_���ٲ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1697_���ڲ���_������{

	static int n, m;
	static int[] arr = new int[100001];

	public static void searchBFS(int num) {
		Queue<Integer> que = new ArrayDeque<>();
		que.add(num);
		arr[num] = 1; // �ʱⰪ

		// BFS
		while (!que.isEmpty()) {
			int now = que.poll();
			for (int i = 0; i < 3; i++) {
				// ������ǥ ���
				int next;
				// �յڷ� �����̴°� �����̵� �� �� �ִ� ��
				if (i == 0)
					next = now + 1;
				else if (i == 1)
					next = now - 1;
				else {
					next = now * 2;
				}
				
				
				if (next == m) {
					System.out.println(arr[now]);
					return;
				}
				if (next >= 0 && next < arr.length && arr[next] == 0) {
					que.add(next);
					arr[next] = arr[now] + 1;
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		if(n==m) { //��ġ���� ��
			System.out.println(0);
		}else searchBFS(n);

	}
}
