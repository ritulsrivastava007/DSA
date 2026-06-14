class Solution {
    public boolean halvesAreAlike(String s) {
        int range = s.length() / 2;
        int f1 = 0, f2 = 0;
        for (int i = 0; i < range; i++) {
            char ch = s.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                f1++;
            }
        }
        for (int i = range; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                f2++;
            }
        }
        return f1 == f2;
    }
}