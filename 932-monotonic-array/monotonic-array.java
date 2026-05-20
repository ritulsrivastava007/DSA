class Solution {
    public boolean isMonotonic(int[] nums) {
        int d = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (d != 0 && d != (nums[i] > nums[i - 1] ? 1 : -1)) {
                    return false;
                }
                d = nums[i] > nums[i - 1] ? 1 : -1;
            }
        }
        return true;
    }
}