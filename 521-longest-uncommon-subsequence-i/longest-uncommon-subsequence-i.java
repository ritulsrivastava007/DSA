class Solution {
    public int findLUSlength(String a, String b) {
        int count = 0;
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        if (count == a.length() && count == b.length()) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}