import java.util.*;

public class Solution {
    public int[] solution(int n, String[] arr) {
        int[] answer = new int[n];
        int cnt = 0;

        for(int i=0; i<arr.length; i++) {

            for(int j=0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O') {
                    cnt++;
                }
                else cnt = 0;
                answer[i] += cnt;
            }
            cnt = 0;

        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = kb.next();
        }

        for(int i : T.solution(n, arr)) {
            System.out.println(i);
        }
    }
}