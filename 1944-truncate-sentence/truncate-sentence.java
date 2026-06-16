class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String[] ans = new String[k];
        for (int i = 0; i < k; i++) {
            ans[i] = words[i];
        }
        return String.join(" ", ans);
    }
}