class Solution {
    public int findShortestSubArray(int[] nums) {
        int maxVal = 50000;
        int[] count = new int[maxVal + 1];
        int[] first = new int[maxVal + 1];

        for (int i = 0; i <= maxVal; i++) {
            first[i] = -1;
        }

        int degree = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (first[num] == -1) {
                first[num] = i;
            }

            count[num]++;

            if (count[num] > degree) {
                degree = count[num];
                minLength = i - first[num] + 1;
            } else if (count[num] == degree) {
                minLength = Math.min(minLength, i - first[num] + 1);
            }
        }
        return minLength;
    }
}