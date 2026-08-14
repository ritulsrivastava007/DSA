class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[256];
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                freq[ch]++;
                if (freq[ch] > 2) {
                    break;
                }
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}