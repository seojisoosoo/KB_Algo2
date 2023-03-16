package Day6.P_크레인인형뽑기게임;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack <Integer> stack = new Stack<>();
        int answer = 0; //인형 갯수
        int now;
        
        //moves만큼 반복
        for(int i=0; i<moves.length; i++){
            now = moves[i]-1;
            for(int j=0; j<board.length; j++){
                if(board[j][now] != 0){ //0이 아니면 
                    if(stack.isEmpty()){
                        stack.push(board[j][now]); //stack에 삽입
                        board[j][now] = 0; //빼낸 인형은 0으로 변경
                        break;
                    }else{
                        if(stack.peek() == board[j][now]){
                            board[j][now] = 0; // 0으로 변경
                            stack.pop();
                            answer += 2;
                            break;
                        } else{
                            stack.push(board[j][now]); //stack에 삽입
                            board[j][now] = 0; //빼낸 인형은 0으로 변경
                            break;
                        } 
                    }  //else문 종료
                } // != 0 조건 if 문
            } // for 문
        }
        
        return answer;
    }
}