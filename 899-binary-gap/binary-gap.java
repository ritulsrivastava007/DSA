class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0,max = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                if (count > 0) {
                    max = Math.max(max, count);
                }
                count = 1;
            } else if (count > 0) {
                count++;
            }
        }
        return max;
    }
}