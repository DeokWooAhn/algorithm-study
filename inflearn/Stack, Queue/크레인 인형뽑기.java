package inflearn;

import java.util.*;

public class Main {
	
	public int soloution(int[][] board, int[] moves) {
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][pos-1] != 0) {
					if(!stack.isEmpty() && stack.peek() == board[i][pos-1]) {
						stack.pop();
						answer += 2;
					}
					else {
						stack.push(board[i][pos-1]);
					}
					board[i][pos-1] = 0;
					break;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		int m = kb.nextInt();
		int[] moves = new int[m];
		
		for(int i=0; i<m; i++) {
			moves[i] = kb.nextInt();
		}
		
		System.out.print(T.soloution(board, moves));
	}
}