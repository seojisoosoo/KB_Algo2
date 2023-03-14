

package  Day4.B1759_��ȣ�����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1759_��ȣ�����_������ {
	// �ߺ� ��� X
	
		static int N;
		static int R;
		static int arr [];				// ��� ���� �迭
		static int selection [];         // ���� ������ ���
		static boolean [] isSelected;     // ��ŷ�迭 - �����ߴ��� üũ
		static StringBuilder sb = new StringBuilder();
		
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	        N = Integer.parseInt(st.nextToken());
	        R = Integer.parseInt(st.nextToken());
			
	        arr = new int[N];
			isSelected = new boolean[N];
			selection = new int[R];
			for(int i = 0; i<N; i++) 
				arr[i] = i+1;
			
			combination(0,0);
			System.out.println(sb);
		}
	    
		public static void combination(int index, int count) {
			// TODO Auto-generated method stub
			if(count == R) {
		    	int x = 0;
		        for(int j=0; j<N; j++) {
		        	if(isSelected[j]) {
		        		sb.append(selection[x++]+ " ");
		        	}
		        }
		        sb.append('\n');
		    	return;
		    }
		    
	
		    //�̹� ���� ���� X : index���� �ٽ� �����ؾ���
		    for(int i=index; i<N; i++) {
		        if(!isSelected[i]) {       // �ߺ��� ��� skip
		        isSelected[i] = true;            // �ߺ� ��ŷ
		        selection[count] = arr[i];               
		        combination(i+1, count+1);        // ���� ��ͷ� ������ +1Tlr 
		        isSelected[i] = false;  
		        // �� �� ������� ����.	
		        }
		    }
	}
		
}
