import java.util.HashSet;
import java.util.Set;

class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (vowels.contains(word.charAt(0))) {
                ans.append(word);
            } else {
                ans.append(word.substring(1));
                ans.append(word.charAt(0));
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