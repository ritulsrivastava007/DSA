import java.util.ArrayList;
class Solution {
    public int numDifferentIntegers(String word) {
        ArrayList<String> list = new ArrayList<>();
        String num = "";
        for (int i = 0; i <= word.length(); i++) {
            if (i < word.length() && Character.isDigit(word.charAt(i))) {
                num += word.charAt(i);
            } else if (!num.equals("")) {
                while (num.length() > 1 && num.charAt(0) == '0')
                    num = num.substring(1);
                if (!list.contains(num))
                    list.add(num);
                num = "";
            }
        }
        return list.size();
    }
}