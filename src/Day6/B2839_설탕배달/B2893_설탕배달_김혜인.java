package Day6.B2839_�������;

import java.util.Scanner;

public class B2893_�������_������ {

	public static void main(String[] args) {
		//�μ��ޱ�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  // ����ϴ� ���� KG
		int cnt = 0;
		
		//N	3	4	5	6	7		8	9	10	11	12		13	14	15	16	17
		//��	1	0	1	2	1		2	3	2	3	4		3	4	3	4	3
		//5 0	0	1	1	1		1	0	2	1	0		2	1	3	2	1	
		//3 1	x	x	2	x		1	3	0	2	0		1	3	0	2	4
		//�� 3	4	0	1	2		3	4	0	1	2		3	4	0	1	2


		if (n == 4 || n == 7) {
			System.out.println(-1);
			
		}else if(n % 5 ==0) {
			cnt += n/5;
			System.out.println(cnt);
			
		}else if (n % 5 == 1 || n % 5 == 3) {
			cnt += (n/5)+1;
			System.out.println(cnt);
		}else if (n % 5 == 2 || n % 5 == 4) {
			
			cnt += (n/5)+2;
			System.out.println(cnt);
	
	}
}
}
