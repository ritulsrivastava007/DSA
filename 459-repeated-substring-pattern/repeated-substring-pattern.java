class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String r = s + s;
        return r.substring(1, r.length() - 1).contains(s);
    }
}