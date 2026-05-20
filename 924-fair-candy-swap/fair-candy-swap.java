class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = 0, b = 0;
        for (int x : aliceSizes) a += x;
        for (int y : bobSizes) b += y;
        for (int x : aliceSizes) {
            for (int y : bobSizes) {
                if (a - x + y == b - y + x) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{};
    }
}