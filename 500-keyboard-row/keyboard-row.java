class Solution {
    public String[] findWords(String[] words) {
        int[] row = new int[26];
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        for (char c : r1.toCharArray()) row[c - 'a'] = 1;
        for (char c : r2.toCharArray()) row[c - 'a'] = 2;
        for (char c : r3.toCharArray()) row[c - 'a'] = 3;

        java.util.List<String> res = new java.util.ArrayList<>();
        for (String word : words) {
            String w = word.toLowerCase();
            int r = row[w.charAt(0) - 'a'];
            boolean ok = true;

            for (int i = 1; i < w.length(); i++) {
                if (row[w.charAt(i) - 'a'] != r) {
                    ok = false;
                    break;
                }
            }
            if (ok) res.add(word);
        }
        return res.toArray(new String[0]);
    }
}