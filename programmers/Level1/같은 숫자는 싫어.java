import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int num = 10;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != num) {
                list.add(arr[i]);
                num = arr[i];
            }
        }

        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int[] arr = {1,1,3,3,0,1,1};

        System.out.println(T.solution(arr));
    }
}