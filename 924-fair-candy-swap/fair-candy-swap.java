class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int sa = 0, sb = 0;
        for (int x : a) sa += x;
        for (int y : b) sb += y;
        HashSet<Integer> set = new HashSet<>();
        for (int y : b) set.add(y);
        int diff = (sa - sb) / 2;
        for (int x : a) {
            if (set.contains(x - diff)) {
                return new int[]{x, x - diff};
            }
        }
        return null;
    }
}