class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        for (char ch : words[0].toCharArray()) {
            boolean found = true;
            for (int i = 1; i < words.length; i++) {
                if (!words[i].contains("" + ch)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                res.add("" + ch);
                for (int i = 1; i < words.length; i++) {
                    words[i] = words[i].replaceFirst("" + ch, "");
                }
            }
        }
        return res;
    }
}