import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int pos : moves) {
            for(int i=0; i<board.length; i++) {
                if(board[i][pos-1] != 0) {
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && stack.peek() == tmp) {
                        stack.pop();
                        answer += 2;
                    }
                    else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int[][] board = {{0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};


        System.out.println(T.solution(board, moves));
    }
}