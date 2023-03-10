package Day2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <Integer> que_arr = new ArrayDeque<>();
		Queue <Integer> que_lst = new LinkedList<>();
		
		// 인큐 = 값 추가 => add or offer
		que_arr.add(5);
		que_arr.add(2);
		que_arr.add(7);
		que_arr.offer(10);
		System.out.println(que_arr);
		
		// 디큐 = 값 제거 => remove or poll
		que_arr.remove();
		que_arr.poll();
		System.out.println(que_arr);

		// peek
		System.out.println(que_arr.peek());
		
		// 연습문제
		Queue <Integer> que = new ArrayDeque<>();
		
		que.offer(100);
		que.offer(200);
		que.offer(300);
		que.offer(400);
		que.offer(500);
		System.out.println(que);
		
		int front = que.poll();
		System.out.println("제거된 값 : " + front);
		System.out.println(que);
		
		System.out.println("큐 맨 앞의 값 : " + que.peek());
		
		while(!que.isEmpty()) {
			System.out.println("제거된 값 : " + que.poll());
		}
		
		
	}

}
