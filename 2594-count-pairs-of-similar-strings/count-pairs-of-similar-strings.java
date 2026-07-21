class Solution {
    public int similarPairs(String[] words) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (String word : words) {
            int mask = 0;
            for (char c : word.toCharArray()) {
                mask |= (1 << (c - 'a'));
            }
            count += map.getOrDefault(mask, 0);
            map.put(mask, map.getOrDefault(mask, 0) + 1);
        }
        return count;
    }
}