class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();

        for (String str : words) {
            String curr = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == separator) {
                    if (!curr.isEmpty()) {
                        ans.add(curr);
                        curr = "";
                    }
                } else {
                    curr += str.charAt(i);
                }
            }

            if (!curr.isEmpty()) {
                ans.add(curr);
            }
        }

        return ans;
    }
}