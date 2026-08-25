class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pairs = 0;
        int leftover = 0;
        int i = 0;
        while (i < nums.length) {
            int j = i;
            while (j < nums.length && nums[j] == nums[i]) {
                j++;
            }
            int freq = j - i;
            pairs += freq / 2;
            leftover += freq % 2;
            i = j;
        }
        return new int[]{pairs, leftover};
    }
}