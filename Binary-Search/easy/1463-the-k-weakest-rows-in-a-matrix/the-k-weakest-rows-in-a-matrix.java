class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] a = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int c = 0;
            for (int x : mat[i]) c += x;
            a[i] = new int[]{c, i};
        }
        Arrays.sort(a, (x, y) -> x[0] == y[0] ? x[1] - y[1] : x[0] - y[0]);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = a[i][1];
        return ans;
    }
}