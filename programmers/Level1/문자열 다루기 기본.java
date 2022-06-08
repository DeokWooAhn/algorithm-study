import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() != 4 && s.length() != 6) {
            return false;
        }

        for(char c : s.toCharArray()) {
            if(c<'0' || c>'9') {
                return false;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String s = "a234";

        System.out.println(T.solution(s));
    }
}