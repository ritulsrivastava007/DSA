class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, left = 0, right = n - 1, i = n - 1;;
        int[] ans = new int[n];
        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l > r) {
                ans[i--] = l;
                left++;
            } else {
                ans[i--] = r;
                right--;
            }
        }
        return ans;
    }
}