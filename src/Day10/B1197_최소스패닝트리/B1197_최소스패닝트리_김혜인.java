
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge> {

	int start;
	int end;
	int weight;
	public Object u;

	public Edge(int start, int end, int weight) {
		super();
		this.start = start;
		this.end = end;
		this.weight = weight;
	}

	// ������ ũ��� ���������ϱ� ���� compareTo()�޼���
	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}

}

public class B1197_�ּҽ��д�Ʈ��_������ {
	static int V; // ������ ����
	static int E; // ������ ����
	static int[] parent; // �θ��� �迭 ����
	static List<Edge> list = new ArrayList();

	public static void main(String[] args) throws IOException {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer token = new StringTokenizer(bf.readLine() , " ");
    int V = Integer.parseInt(token.nextToken());
    int E = Integer.parseInt(token.nextToken());
    int ans = 0;
    
    parent = new int [V+1];
    for (int i = 0; i < parent.length; i++) { //�θ��� ����
		parent[i] = i;
	}; 
    
    for(int i=0; i<E; i++) {
        token = new StringTokenizer(bf.readLine() , " ");
        int start = Integer.parseInt(token.nextToken());
        int end = Integer.parseInt(token.nextToken());
        int weight = Integer.parseInt(token.nextToken());
        list.add(new Edge(start,end,weight));
    }
    
    	// �������� ����
 		Collections.sort(list);
 		
 		int size = list.size();
 		// 2. ���ĵ� ������� ���� Ž��
 		for (int i = 0; i < size; i++) {
 			Edge n = list.get(i);
 			// ���� �� ����� �θ� �ٸ��ٸ�
 			if(!isSameParent(n.start, n.end)) {
 				// sum�� ���� ũ�� ����
 				ans +=n.weight;
 				// �� ��� ����
 				union(n.start,n.end);
 			}
 			
 		}
 	
 		System.out.println(ans);
   
}
	
	
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
		// �θ� �������� �Ǻ����ִ� method
		private static boolean isSameParent(int a, int b) {
			a = find(a);
			b = find(b);

			if (a == b)
				return true;
			else
				return false;
		}
}
