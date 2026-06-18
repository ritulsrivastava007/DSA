class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int expected = 0;
        for (int count : freq) {
            if (count != 0) {
                if (expected == 0) {
                    expected = count;
                } else if (count != expected) {
                    return false;
                }
            }
        }
        return true;
    }
}