class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        boolean[] used = new boolean[words.length];
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (used[i]) continue;
            for (int j = i + 1; j < words.length; j++) {
                if (used[j]) continue;
                if (words[i].charAt(0) == words[j].charAt(1) &&
                    words[i].charAt(1) == words[j].charAt(0)) {
                    count++;
                    used[i] = true;
                    used[j] = true;
                    break;
                }
            }
        }
        return count;
    }
}