import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int add = 0;

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    add = nums[i] + nums[j] + nums[k];
                    if(sosu(add)) answer++;
                }
            }
        }

        return answer;
    }

    private boolean sosu(int add) {
        for(int i=2; i<add; i++) {
            if(add%i==0) return false;
        }
        return true;
    }
}