class Solution {
    public int subsetXORSum(int[] nums) {        
        int sum = 0;
        int subsets = 1 << nums.length;
        for (int i = 0; i < subsets; i++) {
            int xor = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    xor ^= nums[j];
                }
            }
            sum += xor;
        }
        return sum;
    }
}