class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int k = 0;
        for (int num : nums) {
            if (num != -1) {
                seen.add(0, num);
                k = 0;
            } else {
                k++;
                if (k <= seen.size()) {
                    ans.add(seen.get(k - 1));
                } else {
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}