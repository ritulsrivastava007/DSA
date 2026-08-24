class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t = "1" + s + "1";
        int n = t.length();
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }
        ArrayList<Character> type = new ArrayList<>();
        ArrayList<Integer> len = new ArrayList<>();
        int i = 0;
        while (i < n) {
            char ch = t.charAt(i);
            int j = i;
            while (j < n && t.charAt(j) == ch) j++;
            type.add(ch);
            len.add(j - i);
            i = j;
        }
        int gain = 0;
        for (i = 1; i < type.size() - 1; i++) {
            if (type.get(i) == '1' &&
                type.get(i - 1) == '0' &&
                type.get(i + 1) == '0') {
                gain = Math.max(gain,
                        len.get(i - 1) + len.get(i + 1));
            }
        }
        return ones + gain;
    }
}