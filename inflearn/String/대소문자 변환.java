package inflearn;

import java.util.*;

public class Main {

	    public String solution(String str) {
	        String answer = "";
	        
	        for(char x : str.toCharArray()) {
	        	if(Character.isLowerCase(x)) {
	        		answer += Character.toUpperCase(x);
	        	}
	        	else {
	        		answer += Character.toLowerCase(x);
	        	}
	        	/**
	        	아스키코드 이용  65~90까지 대문자
	        	if(x >= 97 && x <= 122) {    소문자
	        		answer += (x - 32);
	         	}
	         	else {  대문자
	         		answer += (char(x+32);
	         	}
	        	 * 
	        	 */
	        }

	        return answer;
	    }

	    public static void main(String args[]) {
	        Main T = new Main();

	        Scanner kb = new Scanner(System.in);

	        String str = kb.next();

	        System.out.println(T.solution(str));

	    }
}


