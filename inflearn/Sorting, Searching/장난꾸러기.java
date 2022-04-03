package inflearn;

import java.util.*;

public class Main {
    
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[2];
        
        int[] tmp = arr.clone();
        
        Arrays.sort(tmp);
        
        for(int i = 0; i<n; i++) {
           if(tmp[i] != arr[i]) {
               answer[0] = i+1;
               break;
           }
           
        }
        for(int j = n-1; j>=0; j--) {
            if(tmp[j] != arr[j]) {
            answer[1] = j+1;
            break;
            }  
        }
        return answer;
    }
    
    public static void main(String args[]) {
      Main T = new Main();
      Scanner kb = new Scanner(System.in);
        
      int n = kb.nextInt();
      int[] arr = new int[n];
      
      for(int i = 0; i<n; i++) {
          arr[i] = kb.nextInt();
      }

      for(int x : T.solution(n, arr)) {
      System.out.print(x+" ");
      }
    }
}