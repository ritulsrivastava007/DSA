class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char ch = word.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                ans.append(word);
            } else {
                for (int j = 1; j < word.length(); j++) {
                    ans.append(word.charAt(j));
                }
                ans.append(ch);
            }
            ans.append("ma");
            for (int j = 0; j <= i; j++) {
                ans.append('a');
            }
            if (i != words.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}