import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int cnt = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    cnt++;
                    break;
                }
            }
        }

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(reserve[j] == lost[i]-1 || reserve[j] == lost[i]+1) {
                    reserve[j] = -1;
                    cnt++;
                    break;
                }
            }
        }

        answer = n - lost.length + cnt;
        return answer;
    }
}