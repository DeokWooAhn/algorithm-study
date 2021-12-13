package inflearn;

import java.util.*;

public class Main {

	    public String solution(String str) {
	        String answer = "";
	        int max = 0; //int max = Integer.MIN_VALUE; 가장 작은 값으로 해도 됌
	        String[] s = str.split(" ");
	        
	        for(String x : s) {
	        	int len = x.length();
	        	if(len > max) {
	        		max = len;
	        		answer = x;
	        	}
	        }
	        
//	        int pos;
//	        while((pos = str.indexOf(" ")) != -1) {
//	        	String tmp = str.substring(0, pos);
//	        	int len = tmp.length();
//	        	if(len > max) {
//	        		max = len;
//	        		answer = tmp;
//	        	}
//	        	str = str.substring(pos + 1);
//	        }
//	        if(str.length()>max) answer = str;
	        
	        return answer;
	    }

	    public static void main(String args[]) {
	        Main T = new Main();

	        Scanner kb = new Scanner(System.in);

	        String str = kb.nextLine();

	        System.out.println(T.solution(str));

	    }
}


