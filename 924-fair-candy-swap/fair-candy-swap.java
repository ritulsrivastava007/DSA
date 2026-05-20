class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;
        for (int a : aliceSizes) {
            aliceSum += a;
        }
        for (int b : bobSizes) {
            bobSum += b;
        }
        for (int a : aliceSizes) {
            for (int b : bobSizes) {
                if (aliceSum - a + b == bobSum - b + a) {
                    return new int[]{a, b};
                }
            }
        }
        return new int[0];
    }
}