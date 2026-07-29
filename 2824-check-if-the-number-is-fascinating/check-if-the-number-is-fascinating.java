class Solution {
    public boolean isFascinating(int n) {
        String num = "" + n + (2 * n) + (3 * n);
        if (num.length() != 9)
            return false;
        char[] ans = num.toCharArray();
        Arrays.sort(ans);
        return new String(ans).equals("123456789");
    }
}