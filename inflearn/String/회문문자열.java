package inflearn;

import java.util.*;

public class Main {

	    public String solution(String str) {

	    	String answer = "NO";
	    	
//	    	str = str.toLowerCase();
	    	
	    	String a = new StringBuilder(str).reverse().toString();
	    	
	    	if(str.equalsIgnoreCase(a)) answer = "YES";

	    	return answer;

	    }

	    public static void main(String args[]) {

	    	Main T = new Main();
	    	Scanner kb = new Scanner(System.in);
	    	String str = kb.next();
	    	System.out.println(T.solution(str));
	        
	    }
}
