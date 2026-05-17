class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0, l = 0, u = 0, d = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'R') r++;
            else if (ch == 'L') l++;
            else if (ch == 'U') u++;
            else if (ch == 'D') d++;
        }
        return r == l && u == d;
    }
}