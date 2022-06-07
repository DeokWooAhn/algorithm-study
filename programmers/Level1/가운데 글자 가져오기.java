import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        if(s.length()%2 != 0) answer = s.substring(s.length()/2, s.length()/2+1);
        else if(s.length()%2 == 0) answer = s.substring(s.length()/2-1, s.length()/2+1);

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String s = "abcde";

        System.out.println(T.solution(s));
    }
}