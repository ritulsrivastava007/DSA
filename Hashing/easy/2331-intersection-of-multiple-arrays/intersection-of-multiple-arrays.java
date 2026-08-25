class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] freq = new int[1001];
        int k = nums.length;
        for (int[] arr : nums) {
            for (int num : arr) {
                freq[num]++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (freq[i] == k) {
                ans.add(i);
            }
        }
        return ans;
    }
}