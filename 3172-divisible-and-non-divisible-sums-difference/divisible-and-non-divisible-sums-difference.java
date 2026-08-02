class Solution {
    public int differenceOfSums(int n, int m) {
        int total = n * (n + 1) / 2;

        int count = n / m;
        int multiplesSum = m * count * (count + 1) / 2;

        return total - 2 * multiplesSum;
    }
}