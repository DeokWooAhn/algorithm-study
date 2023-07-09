import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            if(n%i == 0) answer += i;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 10;

        System.out.println(T.solution(n));
    }
}