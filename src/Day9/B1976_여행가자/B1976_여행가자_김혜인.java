package Day9.B1976_���డ��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1976_���డ��_������ {
	public static int n, m;
	public static int[] parent;
	public String answer;

	// x�� �θ� ã�� ����
	public static int find(int x) {
		if (x == parent[x]) {
			return x;
		}
		return parent[x] = find(parent[x]);
	}

	// y�� �θ� x�� �θ�� ġȯ�ϴ� ���� (x > y �� ���, �ݴ�)
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x != y) {
			if (x < y) {
				parent[y] = x;
			} else {
				parent[x] = y;
			}
		}
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // ������ ��
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken()); // ���� ��ȹ ��

		parent = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			parent[i] = i; // parent �迭
		}

		// ��������
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				int plan = Integer.parseInt(st.nextToken()); // ����� �� �θ�Ȱ��� ����.
				if (plan == 1) {
					union(i, j);
				}
			}
		}

		String answer = "YES";
		String[] plan = br.readLine().split(" ");
		for (int i = 1; i < m; i++) {
			if (find(Integer.parseInt(plan[i]))!= find(Integer.parseInt(plan[i - 1]))) {
				// ������� ���� ��� ��ο� ���� �� �� ���� �� br	aeak
				answer = "NO";
				break;
			}
		}

		System.out.println(answer);
	}
}