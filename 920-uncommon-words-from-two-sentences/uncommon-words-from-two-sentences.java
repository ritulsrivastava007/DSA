class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words = (s1 + " " + s2).split(" ");
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
            if (count == 1) {
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}