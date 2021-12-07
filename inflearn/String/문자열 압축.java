package inflearn;

import java.util.*;

public class Main {
	
	public String solution(String str) {
		String answer = "";
		str = str + " ";
		int j = 1;

		for(int i = 0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) 
				j++;
			
			else {
				answer += str.charAt(i);
				if(j>1)
				answer += String.valueOf(j);
				j = 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String args[]) {
		
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}