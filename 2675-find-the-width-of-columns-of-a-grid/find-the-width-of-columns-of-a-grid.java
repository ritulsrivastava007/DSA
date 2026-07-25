class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int col = 0; col < grid[0].length; col++) {
            int max = 0;
            for (int row = 0; row < grid.length; row++) {
                int len = String.valueOf(grid[row][col]).length();
                max = Math.max(max, len);
            }
            ans[col] = max;
        }
        return ans;
    }
}