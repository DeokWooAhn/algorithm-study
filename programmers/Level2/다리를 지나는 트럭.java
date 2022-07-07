import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();

        for(int i : truck_weights) {
            while(true) {
                if(q.isEmpty()) {
                    q.add(i);
                    sum += i;
                    answer++;
                    break;
                }
                else if(q.size() == bridge_length) {
                    sum -= q.poll();

                }
                else {
                    if(sum + i <= weight) {
                        q.add(i);
                        sum += i;
                        answer++;
                        break;
                    }
                    else {
                        q.add(0);
                        answer++;
                    }
                }
            }
        }

        return answer+bridge_length;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        System.out.println(T.solution(bridge_length, weight, truck_weights));
    }
}