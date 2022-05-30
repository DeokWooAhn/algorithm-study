import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> tmp = new ArrayList<>();

        while(true) {
            if(n<3) {
                tmp.add(n);
                break;
            }
            tmp.add(n%3);
            n=n/3;
        }

        for(int i=0; i<tmp.size(); i++) {
            answer += Math.pow(3, tmp.size()-1-i)*tmp.get(i);
        }

        return answer;
    }

    public static void main(String args[]) {
        Solution T = new Solution();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}