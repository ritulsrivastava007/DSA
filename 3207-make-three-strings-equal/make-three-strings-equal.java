class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int n1 = s1.length(), n2 = s2.length(), n3 = s3.length();
        int min = Math.min(n1, Math.min(n2, n3));
        int count = 0;
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        if (count == 0) {
            return -1;
        }
        return (n1 - count) + (n2 - count) + (n3 - count);
    }
}