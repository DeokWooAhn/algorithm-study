import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};

        answer = new int[2];

        int big = Math.max(n, m);
        int small = Math.min(n, m);

        answer[0] = gcd(big, small);
        answer[1] = big*small/answer[0];

        return answer;
    }

    int gcd(int a, int b) {
        if(a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 3;
        int m = 12;

        System.out.println(T.solution(n, m));
    }
}