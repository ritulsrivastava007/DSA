class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int i = 0;
        for (int num = 1; i < n - 1; num++) {
            ans[i++] = num;
            ans[i++] = -num;
        }
        return ans;
    }
}