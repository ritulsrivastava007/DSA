class Solution {
    public int minimumCost(int[] nums) {
        int[] firstElements = new int[3];
        firstElements[0] = nums[0];
        firstElements[1] = Integer.MAX_VALUE;
        firstElements[2] = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < firstElements[1]) {
                firstElements[2] = firstElements[1];
                firstElements[1] = nums[i];
            } else if (nums[i] < firstElements[2]) {
                firstElements[2] = nums[i];
            }
        }
        return firstElements[0]  + firstElements[1]  + firstElements[2];
    }
}