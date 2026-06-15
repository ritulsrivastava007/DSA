class Solution {
    public int findCenter(int[][] edges) {
        for (int x : edges[0]) {
            boolean ok = true;
            for (int i = 1; i < edges.length; i++) {
                if (edges[i][0] != x && edges[i][1] != x) {
                    ok = false;
                    break;
                }
            }
            if (ok) return x;
        }
        return -1;
    }
}