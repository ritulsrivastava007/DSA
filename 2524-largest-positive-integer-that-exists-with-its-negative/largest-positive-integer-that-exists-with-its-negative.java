class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = -1;
        for (int x : nums) {
            if (set.contains(-x)) {
                ans = Math.max(ans, Math.abs(x));
            }
            set.add(x);
        }
        return ans;
    }
}