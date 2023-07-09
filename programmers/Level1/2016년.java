import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";

        int tmp = 0;
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30 ,31, 31, 30, 31, 30, 31};

        for(int i=0; i<a-1; i++) {
            tmp += date[i];
        }

        tmp += b;

        answer = day[(tmp-1)%7];

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);

        int a = 1;
        int b = 1;

        System.out.println(T.solution(a, b));
    }
}