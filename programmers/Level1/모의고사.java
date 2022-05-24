import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        int[] score = new int[3];

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == a[i%5]) score[0]++;
            if(answers[i] == b[i%8]) score[1]++;
            if(answers[i] == c[i%10]) score[2]++;
        }

        int tmp = 0;
        for(int i=0; i<score.length; i++) {
            if(tmp < score[i]) tmp = score[i];
        }

        List<Integer> list = new ArrayList<>();
        if(tmp == score[0]) list.add(1);
        if(tmp == score[1]) list.add(2);
        if(tmp == score[2]) list.add(3);

        answer = new int[list.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}