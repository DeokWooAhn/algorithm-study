package inflearn;

import java.util.*;

public class Main {
	
	public String soloution(String a, String b) {
		
		String answer = "";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		for(char x : b.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			
			map.put(x, map.get(x)-1);
		}
		
		answer = "YES";
		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String a = kb.next();
		String b = kb.next();
	
		System.out.print(T.soloution(a, b));
	}
}