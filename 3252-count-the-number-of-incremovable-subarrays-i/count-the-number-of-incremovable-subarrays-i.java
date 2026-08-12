class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length, left = 0;
        while (left < n - 1 && nums[left] < nums[left + 1]) {
            left++;
        }
        if (left == n - 1) {
            return n * (n + 1) / 2;
        }
        int count = left + 2;
        int right = n - 1;
        while (right > 0) {
            while (left >= 0 && nums[left] >= nums[right]) {
                left--;
            }
            count += left + 2;
            if (nums[right - 1] >= nums[right]) {
                break;
            }
            right--;
        }
        return count;
    }
}