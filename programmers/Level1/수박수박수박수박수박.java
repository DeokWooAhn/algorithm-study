import java.util.*;

class Solution {
    public String solution(int n) {
        String answer = "";
        int cnt = 0;

        while(cnt <= n) {
            answer += "수";
            cnt++;
            if(cnt == n) break;
            answer += "박";
            cnt++;
            if(cnt == n) break;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 10;

        System.out.println(T.solution(n));
    }
}