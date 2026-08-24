class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans = 0;
        int zero = 0;
        int one = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                if (one > 0) {
                    ans = Math.max(ans, 2 * Math.min(zero, one));
                    zero = 0;
                    one = 0;
                }
                zero++;
            } else {
                one++;
            }
        }
        ans = Math.max(ans, 2 * Math.min(zero, one));
        return ans;
    }
}