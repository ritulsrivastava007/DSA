class Solution {
    public String thousandSeparator(int n) {
        if (n == 0) return "0";
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            int part = n % 1000;
            n /= 1000;
            if (n > 0) {
                ans.insert(0, String.format("%03d", part));
                ans.insert(0, ".");
            } else {
                ans.insert(0, part);
            }
        }
        return ans.toString();
    }
}