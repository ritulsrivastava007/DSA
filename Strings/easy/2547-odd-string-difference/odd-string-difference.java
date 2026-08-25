class Solution {
    public String oddString(String[] words) {
        int m = words.length;
        int n = words[0].length();
        int[][] diff = new int[m][n - 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                diff[i][j] = words[i].charAt(j + 1) - words[i].charAt(j);
            }
        }
        int common;
        if (same(diff[0], diff[1])) {
            common = 0;
        } else if (same(diff[0], diff[2])) {
            return words[1];
        } else {
            return words[0];
        }
        for (int i = 0; i < m; i++) {
            if (!same(diff[i], diff[common])) {
                return words[i];
            }
        }
        return "";
    }
    private boolean same(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}