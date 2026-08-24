class Solution {
    public int alternatingSubarray(int[] nums) {
        int ans = -1;
        int len = 1;

        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];

            if (len == 1) {
                if (diff == 1) {
                    len = 2;
                    ans = Math.max(ans, len);
                }
            } 
            else {
                if ((len % 2 == 0 && diff == -1) || 
                    (len % 2 == 1 && diff == 1)) {
                    len++;
                    ans = Math.max(ans, len);
                } 
                else {
                    len = (diff == 1) ? 2 : 1;
                    ans = Math.max(ans, len == 2 ? len : -1);
                }
            }
        }

        return ans;
    }
}