import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] tmp = new int[n+1];

        for(int i=2; i<=n; i++) {
            if(tmp[i] == 0) {
                answer++;
                for(int j=i; j<=n; j=j+i) {
                    tmp[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 10;

        System.out.println(T.solution(n));
    }
}