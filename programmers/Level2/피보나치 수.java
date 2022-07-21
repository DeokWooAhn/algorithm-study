import java.util.*;

class Solution {
    public int solution(int n) {
        int[] answer = new int[n+1];

        for(int i=0; i<=n; i++) {
            if(i == 0) answer[i] = 0;
            else if(i == 1) answer[i] = 1;
            else answer[i] = (answer[i-2] + answer[i-1]) % 1234567;
        }

        return answer[n];
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 3;

        System.out.println(T.solution(n));
    }
}