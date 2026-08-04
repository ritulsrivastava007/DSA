class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int minStart = Integer.MAX_VALUE;
            ans[i] = -1;
            for (int j = 0; j < n; j++) {
                if (intervals[j][0] >= intervals[i][1] &&
                    intervals[j][0] < minStart) {
                    minStart = intervals[j][0];
                    ans[i] = j;
                }
            }
        }
        return ans;
    }
}