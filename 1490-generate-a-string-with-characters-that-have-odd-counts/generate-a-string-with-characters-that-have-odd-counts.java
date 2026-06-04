class Solution {
    public String generateTheString(int n) {
        return n % 2 == 1 ? "r".repeat(n) : "r".repeat(n - 1) + "s";
    }
}