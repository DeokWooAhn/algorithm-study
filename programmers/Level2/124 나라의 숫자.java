import java.util.*;

class Solution {
    public String solution(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 5;


        System.out.println(T.solution(n));
    }
}