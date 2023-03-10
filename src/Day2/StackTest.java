package Day2;

import java.util.Stack;

public class StackTest {

	public static void stack_method() {
		
		Stack <Integer> stack = new Stack <>();
		
		// push 메소드
		stack.push(1);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		
		// pop 메소드
		int pop_value = stack.pop();
		System.out.println(stack + " 제거한 값 : " + pop_value);
		
		// peek 메소드
		System.out.println(stack.peek());
		
		// isEmpty 메소드
		System.out.println(stack.isEmpty());
		
		// clear 메소드 >> stack 비워주는 메소드
		stack.clear();
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		
		// add 메서드 , remove 메서드는 ArrayList 와 동일
		// stack.add(10);
		// stack.remove(2);
	}
	
	public static void main(String[] args) {
		
		Stack <Integer> stack = new Stack <>();
		
		stack.add(100);
		stack.add(200);
		stack.add(300);
		stack.add(400);
		stack.add(500);
		
		int top = stack.pop();
		System.out.println("top : " + top);
		System.out.println("stack : " + stack);
		System.out.println(stack.peek());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
