import java.util.*;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int tmp = 0;

        if(a>b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        for(long i=a; i<=b; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int[] arr = {5,9,7,0};
        int divisor = 5;

        System.out.println(T.solution(arr, divisor));
    }
}