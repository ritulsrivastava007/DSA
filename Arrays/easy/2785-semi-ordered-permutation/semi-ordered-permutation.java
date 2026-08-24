class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int one = 0, last = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1)
                one = i;
            if (nums[i] == n)
                last = i;
        }
        int ans = one;
        if (one > last)
            last++;
        ans += (n - 1 - last);
        return ans;
    }
}