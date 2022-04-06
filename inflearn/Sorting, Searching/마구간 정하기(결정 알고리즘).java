package inflearn;

import java.util.*;

class Main {
	
	public int count(int[] arr, int dist) { 
		int cnt = 1;
		int ep = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]-ep >= dist) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		int lt = 1;
		int rt = arr[n-1];
		
		Arrays.sort(arr);
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid) >= c) {
				answer = mid;
				lt = mid+1;
			}
			else {
				rt = mid-1;
			}
		}
	
		return answer;
	}
    
    public static void main(String args[]) {
      Main T = new Main();
      Scanner kb = new Scanner(System.in);
        
      int n = kb.nextInt();
      int c = kb.nextInt();
      
      int[] arr = new int[n];
      
      for(int i=0; i<n; i++) {
    	  arr[i] = kb.nextInt();
      }
      
      System.out.println(T.solution(n, c, arr));
    }
}