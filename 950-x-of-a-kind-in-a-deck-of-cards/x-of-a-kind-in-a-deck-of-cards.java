class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : deck) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int gcd = 0;
        for (int f : map.values()) {
            while (gcd != 0) {
                int temp = gcd;
                gcd = f % gcd;
                f = temp;
            }
            gcd = f;
        }
        return gcd > 1;
    }
}