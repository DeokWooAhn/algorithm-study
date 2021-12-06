package inflearn;

import java.util.*;

public class Main {

	    public String solution(String str) {

	    	String answer = "NO";
	    	str = str.toLowerCase().replaceAll("[^a-z]", "");
	    	
//	    	System.out.println(str);
	    	
	    	String tmp = new StringBuilder(str).reverse().toString();
	    	
	    	if(str.equals(tmp)) answer = "YES";
	    	
	    	return answer;

	    }

	    public static void main(String args[]) {

	    	Main T = new Main();
	    	Scanner kb = new Scanner(System.in);
	    	String str = kb.nextLine();
	    	System.out.println(T.solution(str));
	        
	    }
}
