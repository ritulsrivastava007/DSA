class Solution {
    public int countLargestGroup(int n) {
        int[] cnt = new int[37];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int x = i, sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            max = Math.max(max, ++cnt[sum]);
        }
        int ans = 0;
        for (int c : cnt)
            if (c == max) ans++;
        return ans;
    }
}