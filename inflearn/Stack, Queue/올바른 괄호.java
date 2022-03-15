package inflearn;

import java.util.*;

public class Main {
	
	public String soloution(String n) {
		
		String answer = "YES";
		Stack<Character> stack = new Stack<>(); 
		
		for(char x : n.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String n = kb.next();
		
		System.out.print(T.soloution(n));
	}
}