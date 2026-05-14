class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "").toUpperCase(); 
        String result = "";
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result = s.charAt(i) + result;
            count++;
            if (count == k && i != 0) {
                result = "-" + result;
                count = 0;
            }
        }
        return result;
    }
}