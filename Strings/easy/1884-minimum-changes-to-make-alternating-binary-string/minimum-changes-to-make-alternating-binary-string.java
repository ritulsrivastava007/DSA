class Solution {
    public int minOperations(String s) {
        int s0 = 0;
        int s1 = 0;
        for (int i = 0; i < s.length(); i++) {
            char exp0 = (i % 2 == 0) ? '0' : '1';
            char exp1 = (i % 2 == 0) ? '1' : '0';
            if (s.charAt(i) != exp0) {
                s0++;
            }
            if (s.charAt(i) != exp1) {
                s1++;
            }
        }
        return Math.min(s0, s1);
    }
}