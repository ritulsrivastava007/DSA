class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max = -1;
        int div = Integer.MAX_VALUE;
        for (int d : divisors) {
            int freq = 0;
            for (int num : nums) {
                if (num % d == 0) {
                    freq++;
                }
            }
            if (freq > max) {
                max = freq;
                div = d;
            } else if (freq == max && d < div) {
                div = d;
            }
        }
        return div;
    }
}