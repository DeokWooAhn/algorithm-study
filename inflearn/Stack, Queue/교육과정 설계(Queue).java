import java.util.*;

public class Main {
    
    public String solution(String must, String subject) {
        String answer = "YES";
        String a ="";
        Queue<Character> q = new LinkedList<>();
        
        for(char x : must.toCharArray()) {
            q.offer(x);
        }
        
        for(char x : subject.toCharArray()) {
            if(q.contains(x)) {
                if(x != q.poll()) return "NO";
            }
        }
        
        if(!q.isEmpty()) return "NO";
        
        return answer;
    }
    
    
    public static void main(String args[]) {
      Main T = new Main();                
      Scanner kb = new Scanner(System.in);
      
      String must = kb.next();
      String subject = kb.next();

      System.out.println(T.solution(must, subject));
    }
}