class Solution {
    public int prefixCount(String[] words, String pref) {
        int freq = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                freq++;
            }
        }
        return freq;
    }
}