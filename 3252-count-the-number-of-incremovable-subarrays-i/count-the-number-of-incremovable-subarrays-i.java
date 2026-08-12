class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length, count = 0;
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start + len <= n; start++) {
                boolean[] remaining = new boolean[n];
                for (int i = 0; i < n; i++) {
                    if (i < start || i >= start + len) {
                        remaining[i] = true;
                    }
                }
                boolean increasing = true;
                int prev = -1;
                for (int i = 0; i < n; i++) {
                    if (remaining[i]) {
                        if (prev != -1 && nums[i] <= prev) {
                            increasing = false;
                            break;
                        }
                        prev = nums[i];
                    }
                }
                if (increasing) {
                    count++;
                }
            }
        }
        return count;
    }
}