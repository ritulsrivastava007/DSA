class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }
        int repeat = 0, missing = 0;
        for (int num = 1; num <= n * n; num++) {
            if (freq[num] == 2) {
                repeat = num;
            } else if (freq[num] == 0) {
                missing = num;
            }
        }
        return new int[]{repeat, missing};
    }
}