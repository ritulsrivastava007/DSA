class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }
        int[][] dp = new int[n][n];
        for (int len = 2; len <= n; len++) {
            for (int l = 0; l + len <= n; l++) {
                int r = l + len - 1;
                int low = l;
                int high = r - 1;
                int split = l - 1;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    int leftSum = prefix[mid + 1] - prefix[l];
                    int rightSum = prefix[r + 1] - prefix[mid + 1];
                    if (leftSum <= rightSum) {
                        split = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                for (int mid = l; mid <= r - 1; mid++) {
                    int leftSum = prefix[mid + 1] - prefix[l];
                    int rightSum = prefix[r + 1] - prefix[mid + 1];
                    if (leftSum < rightSum) {
                        dp[l][r] = Math.max(
                            dp[l][r],
                            leftSum + dp[l][mid]
                        );
                    } else if (leftSum > rightSum) {
                        dp[l][r] = Math.max(
                            dp[l][r],
                            rightSum + dp[mid + 1][r]
                        );
                    } else {
                        dp[l][r] = Math.max(
                            dp[l][r],
                            Math.max(
                                leftSum + dp[l][mid],
                                rightSum + dp[mid + 1][r]
                            )
                        );
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}