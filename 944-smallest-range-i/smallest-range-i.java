class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0],max = nums[0];
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return Math.max(0, max - min - 2 * k);
    }
}