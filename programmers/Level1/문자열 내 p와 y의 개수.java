import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int tmp = 0;


        s = s.toLowerCase();

        for(char c : s.toCharArray()) {
            if(c == 'p') tmp++;
            if(c == 'y') tmp--;
        }

        if(tmp!=0) answer = false;

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String s = "pPoooyY";

        System.out.println(T.solution(s));
    }
}