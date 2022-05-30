import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(!list.contains(numbers[i]+numbers[j])) {
                    list.add(numbers[i]+numbers[j]);
                }
            }
        }

        Collections.sort(list);

        answer = new int[list.size()];

        int cnt = 0;

        for(int i : list) {
            answer[cnt] = i;
            cnt++;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);

        int[] numbers = {2,1,3,4,1};

        System.out.println(T.solution(numbers));
    }
}