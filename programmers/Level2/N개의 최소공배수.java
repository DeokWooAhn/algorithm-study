import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];

        for(int i : arr) {
            answer = lcm(answer, i);
        }

        return answer;
    }

    int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    int lcm(int a, int b) {
        return a*b / gcd(a,b);
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int[] arr = {2,6,8,14};

        System.out.println(T.solution(arr));
    }
}