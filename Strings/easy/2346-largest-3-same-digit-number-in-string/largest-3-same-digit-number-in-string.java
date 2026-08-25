class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for (int i = 0; i <= num.length() - 3; i++) {
            String curr = num.substring(i, i + 3);
            if (curr.charAt(0) == curr.charAt(1) && curr.charAt(1) == curr.charAt(2)) {
                if (ans.equals("") || curr.compareTo(ans) > 0) {
                    ans = curr;
                }
            }
        }
        return ans;
    }
}