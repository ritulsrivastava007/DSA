class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : deck) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int gcd = 0;
        for (int freq : map.values()) {
            int a = gcd;
            int b = freq;
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            gcd = a;
        }
        return gcd >= 2;
    }
}