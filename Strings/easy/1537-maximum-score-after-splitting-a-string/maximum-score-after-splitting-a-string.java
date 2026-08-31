class Solution {
    public int maxScore(String s) {
        int right = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') right++;
        }
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0')
                left++;
            else
                right--;
            max = Math.max(max, left + right);
        }
        return max;
    }
}