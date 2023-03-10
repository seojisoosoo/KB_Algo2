package Day2;

import java.util.Scanner;
import java.util.Stack;

public class D17608 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		Stack <Integer> stack = new Stack<>();
		for(int i=0;i<N;i++) {
		stack.add(sc.nextInt());
	}
		int value=stack.pop();
		int answer = 1;
		for(int i=0;i<N-1;i++) {
			int pop=stack.pop();
			if (pop>value) {
				answer+=1;
				value=pop;
//			System.out.println(pop);
			}
		}
		System.out.println(answer);
//		System.out.println(value);

}
}
