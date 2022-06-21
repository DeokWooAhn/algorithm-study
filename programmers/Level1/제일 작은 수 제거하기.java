import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        int index = 0;

        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        answer = new int[arr.length-1];

        for(int i=0; i<arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        for(int i=0; i<arr.length; i++) {
            if(min != arr[i]) {
                answer[index] = arr[i];
                index++;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int[] arr = {4,3,2,1};

        System.out.println(T.solution(arr));
    }
}