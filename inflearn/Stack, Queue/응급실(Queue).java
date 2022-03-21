package inflearn;

import java.util.*;

class Person {
    int id;
    int level;
    
    public Person(int id, int level) {
        this.id=id;
        this.level=level;
    }
}

public class Main {
    
    public int solution(int n, int m, int[] p) {
        int answer = 0;
        Queue<Person> q = new LinkedList<>();
        
        for(int i=0; i<n; i++) {
            q.offer(new Person(i, p[i]));
        }
        
        while(!q.isEmpty()) {
            Person tmp = q.poll();
            
            for(Person x : q) {
                if(x.level > tmp.level) {
                  q.offer(tmp);
                  tmp = null;
                  break;
                }
            }
            if(tmp != null) {
            	answer++;
            	
                if(tmp.id == m) {
                	return answer;
                } 
            }
        }
        
        return answer;
    }
    
    
    public static void main(String args[]) {
      Main T = new Main();                
      Scanner kb = new Scanner(System.in);
      
      int n = kb.nextInt();
      int m = kb.nextInt();
      int[] p = new int[n];
      
      for(int i=0; i<n; i++) {
          p[i] = kb.nextInt();
      }

      System.out.println(T.solution(n, m, p));
    }
}