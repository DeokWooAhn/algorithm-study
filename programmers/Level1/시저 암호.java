import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' ') answer += c;

            if(Character.isUpperCase(c)) {
                if(c+n>'Z') answer += (char)(c+n-26);
                else answer += (char)(c+n);
            }

            else if(Character.isLowerCase(c)) {
                if(c+n>'z') answer += (char)(c+n-26);
                else answer += (char)(c+n);
            }

        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String s = "AB C";
        int n = 10;

        System.out.println(T.solution(s, n));
    }
}