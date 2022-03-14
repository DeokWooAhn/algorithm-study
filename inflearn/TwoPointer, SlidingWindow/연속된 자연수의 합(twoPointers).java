package inflearn;

import java.util.*;

public class Main {
	
	public int soloution(int n) {
		
		int answer = 0;
		int sum = 0;
		int p2 = 1;
		
		for(int p1 = 0; p1<n; p1++) {
			sum += p1;
			if(sum == n) {
				answer++;
			}
			while(sum >= n) {
				sum -= p2;
				p2++;
				if(sum == n) {
					answer++;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
	
		System.out.print(T.soloution(n));
	}
}