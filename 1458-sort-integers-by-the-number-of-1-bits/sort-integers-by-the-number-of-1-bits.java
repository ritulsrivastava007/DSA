class Solution {
    public int[] sortByBits(int[] arr) {
        return java.util.Arrays.stream(arr).boxed().sorted((a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b : Integer.bitCount(a) - Integer.bitCount(b)).mapToInt(Integer::intValue).toArray();
    }
}