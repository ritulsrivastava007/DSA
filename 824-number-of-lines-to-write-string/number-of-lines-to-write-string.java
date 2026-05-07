class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int pix = 0;

        for (char ch : s.toCharArray()) {
            int w = widths[ch - 'a'];
            if (pix + w > 100) {
                lines++;
                pix = w;
            } else {
                pix += w;
            }
        }
        return new int[]{lines, pix};
    }
}