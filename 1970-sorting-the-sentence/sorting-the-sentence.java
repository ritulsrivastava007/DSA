class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        for (String word : words) {
            int len = word.length();
            int pos = word.charAt(len - 1) - '0';
            String actualWord = word.substring(0, len - 1);
            res[pos - 1] = actualWord;
        }
        return String.join(" ", res);
    }
}