class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length - 1;
        int count = 0;

        for (int i = n - 1; i >= 0 && bits[i] == 1; i--) {
            count++;
        }
        return count % 2 == 0;
    }
}