class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean inside = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '|') {
                inside = !inside;
            } else if (ch == '*' && !inside) {
                count++;
            }
        }
        return count;
    }
}