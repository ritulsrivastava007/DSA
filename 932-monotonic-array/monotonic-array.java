class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        for (int i = 1; i < nums.length; i++) {
            inc &= nums[i] >= nums[i - 1];
            dec &= nums[i] <= nums[i - 1];
        }
        return inc || dec;
    }
}