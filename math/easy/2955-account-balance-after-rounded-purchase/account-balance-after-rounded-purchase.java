class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int ans = ((purchaseAmount + 5) / 10) * 10;
        return 100 - ans;
    }
}