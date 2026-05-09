class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(cleaned).reverse().toString();

        boolean rev = cleaned.equals(reversed);

        return rev;
    }
}