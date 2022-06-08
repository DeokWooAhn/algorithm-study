import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int tmp = 0;

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                tmp = i;
                break;
            }
        }

        answer = "김서방은 " + tmp + "에 있다";

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String[] seoul = {"Jane", "Kim"};

        System.out.println(T.solution(seoul));
    }
}