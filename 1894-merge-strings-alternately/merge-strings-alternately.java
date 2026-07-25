class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ans = new char[word1.length() + word2.length()];
        int i = 0, j = 0, k = 0;
        while (i < word1.length() && j < word2.length()) {
            ans[k++] = word1.charAt(i++);
            ans[k++] = word2.charAt(j++);
        }
        while (i < word1.length()) {
            ans[k++] = word1.charAt(i++);
        }
        while (j < word2.length()) {
            ans[k++] = word2.charAt(j++);
        }
        return new String(ans);
    }
}