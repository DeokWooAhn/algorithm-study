import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();

        String[] num = s.split(" ");

        for(int i=0; i<num.length; i++) {
            arr.add(Integer.parseInt(num[i]));
        }

        answer = Collections.min(arr) + " " + Collections.max(arr);

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String s = "1 2 3 4";

        System.out.println(T.solution(s));
    }
}