import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";

        for(int i=0; i<phone_number.length()-4; i++) {
            answer += "*";
        }

        for(int i=phone_number.length()-4; i<phone_number.length(); i++) {
            answer += phone_number.charAt(i);
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String phone_number = "0277778888";

        System.out.println(T.solution(phone_number));
    }
}