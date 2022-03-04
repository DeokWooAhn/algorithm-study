package inflearn;

import java.util.*;

public class Main {
	
	public int soloution(int n, int[][] arr) {
		int answer = 0;
		int max = 0;
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			cnt = 0;
			for(int j=1; j<=n; j++) {
				for(int k=1; k<6; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}
		return answer;
	}
	
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5; j++) {
				arr[i][j] = kb.nextInt();	
			}
		}
			System.out.print(T.soloution(n, arr));
	}
}