class Solution {
    public int prefixCount(String[] words, String pref) {
        int c = 0;
        for (String word : words) {
            int count = 0;
            if (word.length() < pref.length()) {
                continue;
            }
            for (int i = 0; i < pref.length(); i++) {
                if (pref.charAt(i) == word.charAt(i)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == pref.length()) {
                c++;
            }
        }
        return c;
    }
}