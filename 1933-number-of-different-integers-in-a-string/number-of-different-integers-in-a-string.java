import java.util.HashSet;
class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        String num = "";
        for (int i = 0; i <= word.length(); i++) {
            if (i < word.length() && Character.isDigit(word.charAt(i))) {
                num += word.charAt(i);
            } else if (!num.isEmpty()) {
                while (num.length() > 1 && num.charAt(0) == '0')
                    num = num.substring(1);
                set.add(num);
                num = "";
            }
        }
        return set.size();
    }
}