import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int tmp = 0;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' ') tmp = -1;

            if(tmp%2==0) {
                c = Character.toUpperCase(c);
                tmp++;
            }
            else {
                c = Character.toLowerCase(c);
                tmp++;
            }

            answer += c;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String s = "try hello world";

        System.out.println(T.solution(s));
    }
}