class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int add = 0;

        for(int x : numbers) {
            add += x;
        }

        answer = 45 - add;

        return answer;
    }
}