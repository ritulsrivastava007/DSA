class Solution {
    public int maxScore(String s) {
        int[] ans = new int[s.length() - 1];
        for (int i = 0; i < s.length() - 1; i++) {
            int c1 = 0, c2 = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') {
                    c1++;
                }
            }
            for (int k = i + 1; k < s.length(); k++) {
                if (s.charAt(k) == '1') {
                    c2++;
                }
            }

            ans[i] = c1 + c2;
        }
        int max = 0;
        for (int x : ans) {
            max = Math.max(max, x);
        }
        return max;
    }
}