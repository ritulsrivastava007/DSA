class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0,max = 0;
        for (int i : gain) {
            alt += i;
            max=Math.max(max,alt);
        }
        return max;
    }
}