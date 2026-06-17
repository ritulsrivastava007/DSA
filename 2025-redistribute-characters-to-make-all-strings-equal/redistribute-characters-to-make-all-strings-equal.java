class Solution {
    public boolean makeEqual(String[] words) {        
        int[] freq = new int[26];
        for (String w : words) {
            for (char ch : w.toCharArray()) {
                freq[ch - 'a']++;
            }
        }
        for (int f : freq) {
            if (f % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}