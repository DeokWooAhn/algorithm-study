package inflearn;

import java.util.*;

public class Main {
	
	public int soloution(String n) {
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : n.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x-48);
			}
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				
				if(x == '+') stack.push(lt + rt);
				else if(x == '-') stack.push(lt - rt);
				else if(x == '*') stack.push(lt * rt);
				else if(x == '/') stack.push(lt / rt);
			}
		}
		
		answer = stack.peek();
		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String n = kb.next();
		
		System.out.print(T.soloution(n));
	}
}