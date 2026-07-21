class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }
        for (int col = n - 1; col >= 0; col--) {
            int max = 0;
            for (int row = 0; row < m; row++) {
                max = Math.max(max, grid[row][col]);
            }
            ans += max;
        }
        return ans;
    }
}