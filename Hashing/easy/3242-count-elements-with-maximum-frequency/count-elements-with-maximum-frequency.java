class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int max = 0, ans = 0, count = 1;
        for (int i = 1; i <= nums.length; i++) {
            if (i < nums.length && nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    ans = count;
                } 
                else if (count == max) {
                    ans += count;
                }
                count = 1;
            }
        }
        return ans;
    }
}