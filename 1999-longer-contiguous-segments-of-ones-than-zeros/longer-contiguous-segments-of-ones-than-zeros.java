class Solution {
    public boolean checkZeroOnes(String s) {        
        int max1 = 0, max0 = 0;
        int s1 = 0, s0 = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                s1++;
                s0 = 0;
            } else {
                s0++;
                s1 = 0;
            }           
            max1 = Math.max(max1, s1);
            max0 = Math.max(max0, s0);
        }
        return max1 > max0;
    }
}