class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                String a = s.substring(l + 1, r + 1);
                String b = s.substring(l, r);

                return a.equals(new StringBuilder(a).reverse().toString()) ||
                       b.equals(new StringBuilder(b).reverse().toString());
            }
            l++;
            r--;
        }
        return true;
    }
}