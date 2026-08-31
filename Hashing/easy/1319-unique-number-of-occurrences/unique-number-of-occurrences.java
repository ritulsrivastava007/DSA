class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        for (int num : arr) {
            freq[num + 1000]++;
        }
        HashSet<Integer> seen = new HashSet<>();
        for (int count : freq) {
            if (count == 0) continue;
            if (!seen.add(count)) {
                return false;
            }
        }
        return true;
    }
}