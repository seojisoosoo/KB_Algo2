package Day8.B1697_숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1697_숨박꼭질_김혜인{

	static int n, m;
	static int[] arr = new int[100001];

	public static void searchBFS(int num) {
		Queue<Integer> que = new ArrayDeque<>();
		que.add(num);
		arr[num] = 1; // 초기값

		// BFS
		while (!que.isEmpty()) {
			int now = que.poll();
			for (int i = 0; i < 3; i++) {
				// 다음좌표 계산
				int next;
				// 앞뒤로 움직이는거 순간이동 할 수 있는 거
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
		
		if(n==m) { //위치같을 때
			System.out.println(0);
		}else searchBFS(n);

	}
}
