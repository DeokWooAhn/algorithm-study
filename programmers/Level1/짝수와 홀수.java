import java.util.*;

class Solution {
    public String solution(int num) {
        String answer = "";

        if(num%2 == 0) answer = "Even";

        else answer = "Odd";

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 3;

        System.out.println(T.solution(n));
    }
}