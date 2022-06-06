import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;

        for(int i=1; i<=count; i++) {
            total += price*i;
        }

        if(total>money) {
            answer = total - money;
        }

        else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int price = 3;
        int money = 20;
        int count = 4;

        System.out.println(T.solution(price, money, count));
    }
}