class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int start = Math.max(0, i - k);
                int end = Math.min(nums.length - 1, i + k);
                for (int j = start; j <= end; j++) {
                    visited[j] = true;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}