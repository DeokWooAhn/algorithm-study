import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(arr);

        for(int i : arr) {
            if(i%divisor == 0) {
                list.add(i);
            }
        }

        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int[] arr = {5,9,7,0};
        int divisor = 5;

        System.out.println(T.solution(arr, divisor));
    }
}