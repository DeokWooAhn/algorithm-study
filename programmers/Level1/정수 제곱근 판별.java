import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        long sqrt = (long)Math.sqrt(n);

        if(Math.pow(sqrt, 2) == n) answer = (long)Math.pow(sqrt+1, 2);
        else answer = -1;

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        long n = 121;

        System.out.println(T.solution(n));
    }
}