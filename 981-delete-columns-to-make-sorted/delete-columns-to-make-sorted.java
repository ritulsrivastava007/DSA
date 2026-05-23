class Solution {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int count = 0;
        char[][] arr = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            arr[i] = strs[i].toCharArray();
        }
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows - 1; i++) {
                if (arr[i][j] > arr[i + 1][j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}