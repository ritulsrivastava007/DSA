class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] freq = new int[1001];
        for (int x : target) freq[x]++;
        for (int x : arr) freq[x]--;
        for (int x : freq) {
            if (x != 0) return false;
        }
        return true;
    }
}