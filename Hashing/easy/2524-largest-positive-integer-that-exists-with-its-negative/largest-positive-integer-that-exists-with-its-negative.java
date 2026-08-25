class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == 0) {
                return nums[j];
            } else if (sum < 0) {
                i++;
            } else {
                j--;
            }
        }
        return -1;
    }
}