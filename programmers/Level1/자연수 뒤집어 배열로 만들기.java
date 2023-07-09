import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};

        String s = ""+n;

        answer = new int[s.length()];

        while(n>0) {
            for(int i=0; i<s.length(); i++) {
                answer[i] = (int)(n%10);
                n = n/10;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 12345;

        System.out.println(T.solution(n));
    }
}