class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > threshold) {
                len = 0;
                continue;
            }
            if (len == 0) {
                if (nums[i] % 2 == 0) {
                    len = 1;
                }
            } 
            else {
                if (nums[i] % 2 != nums[i - 1] % 2) {
                    len++;
                } 
                else {
                    if (nums[i] % 2 == 0) {
                        len = 1;
                    } 
                    else {
                        len = 0;
                    }
                }
            }
            max = Math.max(max, len);
        }
        return max;
    }
}