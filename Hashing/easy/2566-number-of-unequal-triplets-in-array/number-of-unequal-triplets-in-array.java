class Solution {
    public int unequalTriplets(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int left = 0;
        int i = 0;
        while (i < nums.length) {
            int j = i;
            while (j < nums.length && nums[j] == nums[i]) {
                j++;
            }
            int mid = j - i;
            int right = nums.length - j;
            ans += left * mid * right;
            left += mid;
            i = j;
        }
        return ans;
    }
}