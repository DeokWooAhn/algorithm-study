import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int tmp = x;

        while(tmp != 0) {
            sum += tmp%10;
            tmp /= 10;
        }

        if(x%sum != 0) {
            answer = false;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 11;

        System.out.println(T.solution(n));
    }
}