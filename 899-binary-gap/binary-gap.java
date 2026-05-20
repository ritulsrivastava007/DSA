class Solution {
    public int binaryGap(int n) {
        String b = Integer.toBinaryString(n);
        int max = 0, last = -1;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                if (last != -1 && i - last > max) {
                    max = i - last;
                }
                last = i;
            }
        }
        return max;
    }
}