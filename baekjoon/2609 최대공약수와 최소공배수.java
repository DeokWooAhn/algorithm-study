import java.util.*;

public class Main {
    public int[] solution(int n, int m) {
        int[] answer = {};

        answer = new int[2];

        int small = Math.max(n, m);
        int big = Math.min(n, m);

        answer[0] = gcd(big, small);
        answer[1] = big*small/answer[0];

        return answer;
    }

    int gcd(int a, int b) {
        if(a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }

    public static void main(String args[]) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i : T.solution(n, m)) {
            System.out.println(i);
        }
    }
}