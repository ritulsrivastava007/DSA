class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int count = 0;
            for (int num : nums) {
                if (sum + num <= queries[i]) {
                    sum += num;
                    count++;
                } else {
                    break;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}