class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int col = 0; col < grid[0].length; col++) {
            int max = 0;
            for (int row = 0; row < grid.length; row++) {
                max = Math.max(max, length(grid[row][col]));
            }
            ans[col] = max;
        }
        return ans;
    }
    private int length(int num) {
        if (num == 0) return 1;
        int count = 0;
        if (num < 0) {
            count++;       
            num = -num;
        }
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}