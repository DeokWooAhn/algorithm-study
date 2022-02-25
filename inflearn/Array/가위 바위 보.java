package inflearn;

import java.util.*;

public class Main {
	
	public String solution(int n, int[] a, int[] b) {
		
		String answer = "";
		
		for(int i = 0; i<n; i++) {
			switch(a[i]) {
			case 1:
				if(b[i] == 1) answer += "D";
				else if(b[i] == 2) answer += "B";
				else answer += "A";
				break;
			case 2:
				if(b[i] == 1) answer += "A";
				else if(b[i] == 2) answer += "D";
				else answer += "B";
				break;
			case 3:
				if(b[i] == 1) answer += "B";
				else if(b[i] == 2) answer += "A";
				else answer += "D";
				break;
			}
		}
		
		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i<n; i++) {
			a[i] = kb.nextInt();
		}
		
		for(int i = 0; i<n; i++) {
			b[i] = kb.nextInt();
		}
		
		for(char x : T.solution(n, a, b).toCharArray()) {
			System.out.println(x);
		}
	}
}