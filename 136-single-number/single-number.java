class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int j;
            for(j=0;j<nums.length;j++){
                 if (i == j) {
                    continue;
                }
                if (nums[i] == nums[j]) {
                    break;
                }
            }
            if (j == nums.length) {
                return nums[i];
            }
        }
        return -1;
    }
}