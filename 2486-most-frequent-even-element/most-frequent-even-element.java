class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int freq = 0, max = 0;
        int ans = -1;
        for (int i = 0; i < nums.length; ) {
            int count = 1;
            while (i + count < nums.length && nums[i] == nums[i + count]) {
                count++;
            }
            if (nums[i] % 2 == 0) {
                if (count > max || (count == max && (ans == -1 || nums[i] < ans))) {
                    max = count;
                    ans = nums[i];
                }
            }
            i += count;
        }
        return ans;
    }
}