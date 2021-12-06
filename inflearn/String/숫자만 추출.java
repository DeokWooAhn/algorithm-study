package inflearn;

import java.util.*;

public class Main {

	    public int solution(String str) {

	    	String answer = "";
	    
//	    	for(char x : str.toCharArray()) {
//	    		if(Character.isDigit(x)) answer+=x;
//	    	}
	    	
	    	// isDigit 숫자판별 함수
	    	
	    	str = str.toLowerCase().replaceAll("[a-z]", "");
	    	

	        for(char x : str.toCharArray()) {
	        	if(str.charAt(0) != 0) {
	        		 answer += x;
	        	}
	        }
	    	
	    	return Integer.parseInt(answer);

	    }

	    public static void main(String args[]) {

	    	Main T = new Main();
	    	Scanner kb = new Scanner(System.in);
	    	String str = kb.next();
	    	System.out.println(T.solution(str));
	        
	    }
}
