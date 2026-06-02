class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int num = Integer.parseInt(s.substring(i - 2, i));
                ans.append((char) ('a' + num - 1));
                i -= 2;
            } else {
                int num = s.charAt(i) - '0';
                ans.append((char) ('a' + num - 1));
            }
        }
        return ans.reverse().toString();
    }
}