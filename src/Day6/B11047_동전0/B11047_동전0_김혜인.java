package Day6.B11047_����0;

import java.util.Scanner;

public class B11047_����0_������ {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�μ��ޱ�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //��������
		int m = sc.nextInt();  //�ݾ�
		int [] A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
		}
		
		
		//������ ū �������� �ޱ�
		int count = 0; 
		for(int i=n-1; i>=0; i--) {
			if(A[i]<=m) {
				count += (m/A[i]); // (��ǥ�ݾ�/�����ݾ�)
				m = m%A[i]; //������ �ݾ����� ��ȯ
			}
		
		}
		System.out.println(count);
	}

}
