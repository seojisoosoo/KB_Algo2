package Day2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N= sc.nextInt();
		Queue <Integer> que = new ArrayDeque<>(); //*추천
		for(int i=1;i<=N;i++) {
			que.add(i);
		}
		while(que.size()>1) {
			
		que.poll();
		int q= que.poll();
		que.add(q);
				}
		System.out.println(que.peek());
	}

}
