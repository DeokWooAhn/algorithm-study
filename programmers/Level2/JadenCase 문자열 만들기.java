import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        boolean flag = true;

        String[] tmp = s.toLowerCase().split("");

        for(String index : tmp) {
            answer += flag ? index.toUpperCase() : index;
            flag = index.equals(" ") ? true : false;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String s = "3people unFollowed me";

        System.out.println(T.solution(s));
    }
}