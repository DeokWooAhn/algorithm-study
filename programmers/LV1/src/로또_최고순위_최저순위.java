import java.util.*;

class Solution {

    public int[] solution(int[] lottos, int[] win_nums) {
        // int[] answer = {};

        int zero = 0;
        int match = 0;

        for (int i : lottos) {
            if(i == 0) {
                zero++;
            }
            else {
                for(int j : win_nums) {
                    if(i == j) {
                        match++;
                        break;
                    }
                }
            }
        }

        int max = match + zero;
        int min = match;

        int[] answer = {Math.min((7-max), 6), Math.min((7-min), 6)};

        return answer;
    }
}