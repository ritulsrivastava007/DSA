class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] dist = new int[n];

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == c) {
                    min = Math.min(min, Math.abs(i - j));
                }
            }
            dist[i] = min;
        }
        return dist;
    }
}