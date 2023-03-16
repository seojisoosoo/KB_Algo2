package Day6.P_크레인인형뽑기게임;

import java.util.*;
import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class P_크레인인형뽑기_Sol {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;

		Stack <Integer> stack = new Stack<>();
		stack.push(0);  // stack 이 비어있는 경우를 방지 

		// move -> x 열 선택
		for (int move : moves) {
			for (int y = 0; y < board.length; y++) {
				if (board[y][move - 1] != 0) {
					if (stack.peek() == board[y][move - 1]) {
						stack.pop();
						answer += 2;
					} 
					else {
						stack.push(board[y][move - 1]);
					}
					board[y][move - 1] = 0;
					break;
				}
			}
		}
		return answer;
	}
}
