class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;
        int cnt = 1;
        int k = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[0] != nums[i]) cnt++;

            for(int j=i+1; j<nums.length; j++) {
                k = nums[j];

                if(k != nums[0] && k == nums[i]) {
                    cnt --;
                    break;
                }
            }
        }

        if(cnt>n) answer = n;
        else answer = cnt;

        return answer;
    }
}