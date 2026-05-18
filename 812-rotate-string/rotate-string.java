class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int k = 0; k < n; k++) {
            String rotated = "";
            for(int i = 0; i < n; i++) {
                rotated += arr[(k + i) % n];
            }
            if(rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}