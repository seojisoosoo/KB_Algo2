package Day4.B9742_����;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9742_����_������{
	 static String[] arr;
	    static int cnt = 0;
	    static int R;
	    static int[] selected;
	    static boolean[] isSelected;
	    
	    
	    
	    static void permutation(int r, int N) {
	        if (r == R) {
	            cnt++; //���� �ϳ��� count
	            if (cnt == N) { 
	                for (int i = 0; i < R; i++) System.out.print(arr[selected[i]]);
	                System.out.println();
	                return;
	            }
	            
	        }
	        
	        //�ߺ� ����x
	        for (int i = 0; i < arr.length; i++) {
	            if (isSelected[i]) continue;
	            isSelected[i] = true;
	            selected[r] = i;
	            permutation(r + 1, N);
	            isSelected[i] = false;
	        }
	    }



	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String input = "";
	        
	        //�Է¹ޱ�
	        while ((input = br.readLine()) != null && input.length() != 0) {
	            StringBuilder stringBuilder = new StringBuilder();  /// ��
	            
	            cnt = 0; //���ο� �� �ٽ� ���� 0���� �ٽ� ���� �ʿ�
	            String[] split = input.split(" ");
	            arr = split[0].split("");  //���� ����� �迭 
	            
	            
	            //�ݺ�
	            for (String a : arr) {  
	                stringBuilder.append(a);
	            }
	            
	            //��
	            stringBuilder.append(" ");
	            stringBuilder.append(split[1]);
	            stringBuilder.append(" = ");
	            
	            
	            R = arr.length;
	            int N = Integer.parseInt(split[1]);  //����ã��
	            selected = new int[arr.length];	//����
	            isSelected = new boolean[arr.length];

	            
	            //��ü ������ ����
	            int factor = 1;
	            for (int i=1; i<=arr.length; i++) {
	            	factor *=i ;            
	        	 
	            }
	            
	            System.out.print(stringBuilder);
	   
	          
	            if(N <=factor) {
	            	 permutation(0,N);  //�����Լ� ����
	            }else {
	            	System.out.println("No permutation");  // ���� ������ �䱸�ϴ� �ͺ��� ������ �������� ����
	            }
	            
	            
	        }
	        br.close();
	    }
	    
}