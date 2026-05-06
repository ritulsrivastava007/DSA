import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> freq = new HashMap<>();
        paragraph = paragraph.toLowerCase();
        String[] words = paragraph.split("\\W+");

        String ans = "";
        int max = 0;

        for (String w : words) {
            if (w.length() == 0 || ban.contains(w)) continue;

            int c = freq.getOrDefault(w, 0) + 1;
            freq.put(w, c);

            if (c > max) {
                max = c;
                ans = w;
            }
        }
        return ans;
    }
}