class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        int[] maxDigit = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int digit = 0;
            while (num > 0) {
                digit = Math.max(digit, num % 10);
                num /= 10;
            }
            maxDigit[i] = digit;
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (maxDigit[i] == maxDigit[j]) {
                    ans = Math.max(ans, nums[i] + nums[j]);
                }
            }
        }
        return ans;
    }
}