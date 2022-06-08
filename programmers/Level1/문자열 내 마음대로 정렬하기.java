import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<strings.length; i++) {
            list.add(strings[i].charAt(n)+strings[i]);
        }

        Collections.sort(list);

        answer = new String[list.size()];

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();

        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        System.out.println(T.solution(strings, n));
    }
}