package inflearn;

import java.util.*;

public class Main {
	
	public int[] soloution(int n, int[] arr) {
		int[] answer = new int[n];
		int rank = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i]<arr[j]) {
					rank++;
				}
			}
			answer[i] = rank;
			rank = 1;
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
		for(int x : T.soloution(n, arr)) {
			System.out.print(x+ " ");
		}
		
	}
}