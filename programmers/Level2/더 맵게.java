import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i : scoville) {
            heap.add(i);
        }

        while(heap.peek() < K) {
            if(heap.size() == 1) {
                return -1;
            }

            int a = heap.poll();
            int b = heap.poll();

            int sum = a+b*2;

            heap.add(sum);
            answer++;
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int[] scoville = {1,2,3,9,10,11};
        int K = 7;

        System.out.println(T.solution(scoville, K));
    }
}