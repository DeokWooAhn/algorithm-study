package inflearn;

import java.util.*;

public class Main {
	
	public int soloution(int n, int[] arr) {
		int answer = 0;
		int ch = 1;
		
		for(int i=0; i<n; i++) {
			if(arr[i] == 1) {
				answer += ch;
				ch++;
			}
			else if(arr[i] == 0) {
				ch = 1;
			}
		}
		
		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.print(T.soloution(n, arr));
	}
}