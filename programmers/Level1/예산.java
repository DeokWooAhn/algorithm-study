import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int tmp = 0;

        Arrays.sort(d);

        for (int i : d) {
            while (budget >= i) {
                tmp = budget - i;
                budget = tmp;
                answer++;
                break;
            }

//            if(budget>=i) {
//                tmp = budget - i;
//                budget = tmp;
//                answer++;
//            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);

        int[] d = {2,2,3,3};
        int budget = 10;

        System.out.println(T.solution(d, budget));
    }
}