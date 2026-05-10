class Solution {
    public int hammingWeight(int n) {
        String r = Integer.toBinaryString(n);
        int c = 0;

        for (int i = 0; i < r.length(); i++) {
            if (r.charAt(i) == '1') {
                c++;
            }
        }
        return c;
    }
}