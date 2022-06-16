import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String tmp = "";

        String s = ""+n;

        String[] arr = s.split("");

        Arrays.sort(arr, Comparator.reverseOrder());

        for(int i=0; i<arr.length; i++) {
            tmp += arr[i];
        }

        answer = Long.parseLong(tmp);

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int n = 118372;

        System.out.println(T.solution(n));
    }
}