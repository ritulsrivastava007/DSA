class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        
        int pos = 0;
        while (pos < n && nums[pos] < target) {
            pos++;
        }
        return pos;
    }
}