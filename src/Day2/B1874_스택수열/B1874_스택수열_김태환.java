package Day2.B1874_스택수열;

import java.util.Scanner;
import java.util.Stack;

public class B1874_스택수열_김태환 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Stack <Integer> stack = new Stack <>();
//		int n =sc.nextInt();
//		int [] arr = new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int j=0;
//		int i=1;
//		stack.add(1);
//		String [] answer = new String[n*2];
//		answer[0]="+";
//		int k=1;
//		while(stack.size()>0) {
//			if (stack.peek()!=arr[j]) {
//				answer[k]="+";
//				i+=1;
//				stack.add(i);
//				k+=1;
//				
//			}
//			if (stack.peek()==arr[j]) {
//				answer[k]="-";
//				stack.pop();
//				j+=1;
//				
//				k+=1;
//			}
//			
//	
//
//	}
////		System.out.println(k);
//		if(k==n*2) {
//			for(int t=0;t<answer.length;t++) {
//				System.out.println(answer[t]);
//			}
//		}
//			else {
//				System.out.println("NO");
//			}
//		}
//
//}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int [] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		int idx=1;
		Stack <Integer> stack = new Stack <>();
		StringBuilder builder = new StringBuilder();
		for (int i=0;i<N;i++) {
			int now = arr[i];
			if (stack.isEmpty() || now>stack.peek()) {
		
		
		for (int j=idx ; j<=now;j++) {
				stack.add(idx);
				idx++;
				builder.append("+\n");
			}
			stack.pop();
			builder.append("-\n");
			}
			else if (now==stack.peek()) {
				stack.pop();
				builder.append("-\n");
			}
			else if (now<stack.peek()) {
				System.out.println("NO");
				return;
			}
		}
	System.out.println(builder.toString());
	}
}
	

