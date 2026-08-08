class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(word1.charAt(i),
                    k -> new ArrayList<>()).add(i);
        }
        int[] right = new int[m + 1];
        right[m] = n;
        for (int i = m - 1; i >= 0; i--) {
            ArrayList<Integer> list = map.get(word2.charAt(i));
            if (list == null) {
                right[i] = -1;
                continue;
            }
            int p = lowerBound(list, right[i + 1]);
            if (p == 0) {
                right[i] = -1;
            } else {
                right[i] = list.get(p - 1);
            }
        }
        int[] ans = new int[m];
        int prev = -1;
        boolean usedMismatch = false;
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> list =
                    map.get(word2.charAt(i));

            int exact = -1;
            if (list != null) {
                int p = upperBound(list, prev);
                if (p < list.size()) {
                    exact = list.get(p);
                }
            }
            int mismatch = -1;
            if (!usedMismatch) {
                int start = prev + 1;
                int end;
                if (i + 1 == m) {
                    end = n - 1;
                } else {
                    if (right[i + 1] == -1) {
                        end = -1;
                    } else {
                        end = right[i + 1] - 1;
                    }
                }
                if (end >= start) {
                    for (int j = start; j <= end; j++) {
                        if (word1.charAt(j) != word2.charAt(i)) {
                            mismatch = j;
                            break;
                        }
                    }
                }
            }
            if (exact != -1 && mismatch != -1) {
                if (exact < mismatch) {
                    ans[i] = exact;
                } else {
                    ans[i] = mismatch;
                    usedMismatch = true;
                }
            } else if (exact != -1) {
                ans[i] = exact;
            } else if (mismatch != -1) {
                ans[i] = mismatch;
                usedMismatch = true;
            } else {
                return new int[0];
            }
            prev = ans[i];
        }
        return ans;
    }
    private int upperBound(ArrayList<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid) <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
    private int lowerBound(ArrayList<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid) < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}