import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 0;

        while(n>0) {
            tmp = n%10;
            answer += tmp;
            n = n/10;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 123;

        System.out.println(T.solution(n));
    }
}