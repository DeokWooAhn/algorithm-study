package inflearn;

import java.util.*;

public class Main {
	
	public int soloution(String n) {
		
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<n.length(); i++) {
			if(n.charAt(i) == '(') {
				stack.push('(');
			}
			else {
				if(n.charAt(i-1) == '(') {
					stack.pop();
					answer += stack.size();
				}
				else {
					stack.pop();
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String n = kb.next();
		
		System.out.print(T.soloution(n));
	}
}