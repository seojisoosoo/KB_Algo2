package Day8.B9663_NQueen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9663_Nqueen_������ {
	static int n;
	static int [] arr;
	static int count;

	
	//Ž��. k���� n���� �ุ ���� ��.
	public static void search(int k) { //k=queen�ǰ���
		if(k==n) {
			count ++;
			return;
		}
		for(int i=0; i<n; i++) {
			arr[k] = i;
			 if(back(k)){  //���
				 search(k+1);
			 }
		}
	}
	
	public static boolean back(int k) {
		for(int i=0; i<k; i++) {  //ù���� depth��0�̵��ͼ� ������ ������ �ȵ� >> �׷��� 1���Ͱ� �ƴ϶� 0���� �ؼ� 1������
			if(arr[i] == arr[k]) { //���� ���� �ε����� �ִ°� �ȵ�. �װ� Ȯ������
				return false;
			}else if( Math.abs(arr[i] - arr[k]) == Math.abs(i-k)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());  //�Է�
		arr = new int[n];
		count = 0;
		search(0);
		System.out.println(count);
		
	} //main �� ��

}
