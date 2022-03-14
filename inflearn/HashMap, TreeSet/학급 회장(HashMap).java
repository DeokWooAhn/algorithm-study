package inflearn;

import java.util.*;

public class Main {
	
	public Character soloution(int n, String k) {
		
		Character answer = ' ';
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : k.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = 0;
		
		for(char key : map.keySet()) {
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
		}

		return answer;
	}
	
	public static void main(String args[]) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		String k = kb.next();
	
		System.out.print(T.soloution(n, k));
	}
}