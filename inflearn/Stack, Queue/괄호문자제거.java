package inflearn;

import java.util.*;

public class Main {
	
	public String soloution(String n) {
		
		String answer = "";
		Stack<Character> stack = new Stack<>(); 
		
		for(char x : n.toCharArray()) {
			stack.push(x);
			if(x == ')') {
				while(stack.pop() != '(');
			}
		}
		
		for(int i=0; i<stack.size(); i++) {
			answer += stack.get(i);
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