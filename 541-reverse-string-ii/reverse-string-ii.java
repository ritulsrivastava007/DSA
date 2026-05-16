class Solution {
    public String reverseStr(String s, int k) {
        String ans = "";

        for (int i = 0; i < s.length(); i += 2 * k) {

            int end = Math.min(i + k, s.length());
            String first = s.substring(i, end);

            String rev = "";
            for (int j = first.length() - 1; j >= 0; j--) {
                rev += first.charAt(j);
            }

            ans += rev;

            if (end < s.length()) {

                int secondEnd = Math.min(end + k, s.length());

                ans += s.substring(end, secondEnd);
            }
        }
        return ans;
    }
}