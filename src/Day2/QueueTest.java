package Day2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void Queuemethod() {
		
		Queue <Integer> que_arr = new ArrayDeque<>();
		Queue <Integer> que_lst = new LinkedList<>();
		
		// 인큐 = 값추가 => add 메소드 or offer 메소드
		que_arr.add(5);
		que_arr.add(2);
		que_arr.add(7);
		que_arr.offer(10);
		System.out.println(que_arr);
		
		// 디큐 = 값제거 => remove or poll 메소드
		que_arr.remove();
		que_arr.poll();
		System.out.println(que_arr);
		
		// peek 메소드 => 맨 앞에 값 리턴
		System.out.println(que_arr.peek());
		
		// isEmpty 메소드 
		System.out.println(que_arr.isEmpty());
		
		// clear 메소드
		que_arr.clear();
		System.out.println(que_arr);
		System.out.println(que_arr.isEmpty());
	
	}


	public static void main(String[] args) {
		
		Queue <Integer> que = new ArrayDeque<>();
		
		que.add(100);
		que.add(200);
		que.add(300);
		que.add(400);
		que.add(500);
		
		int front = que.poll();
		System.out.println("front : " + front);
		System.out.println(que);
		
		System.out.println(que.peek());
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
	}
}

