package inflearn;

import java.util.*;

public class Main {
	
	public int soloution(int n, int k, int[] arr) {
		
		int answer = 0;
		int cnt = 0;
		int p2 = 0;
				
		for(int p1=0; p1<n; p1++) {
			if(arr[p1] == 0) cnt++;
			while(cnt>k) {
				if(arr[p2] == 0) cnt--;
				p2++;
			}
			answer = Math.max(answer, p1-p2+1);
		}

		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
	
		System.out.print(T.soloution(n, k, arr));
	}
}