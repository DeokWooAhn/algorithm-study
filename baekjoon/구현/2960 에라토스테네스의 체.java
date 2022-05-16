import java.util.*;

public class Solution {
    public int solution(int n, int k) {
        int cnt = 0;
        int[] ch = new int[n+1];

        for(int i=2; i<=n; i++) {
            for(int j=i; j<=n; j=j+i) {
                if(ch[j] == 0) {
                    cnt++;
                    ch[j] = 1;
                }

                if(cnt == k) return j;
            }
        }

        return 0;
    }



    public static void main(String args[]) {
        Solution T  = new Solution();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();

        System.out.print(T.solution(n,k));
    }
}