import java.util.*;

class Solution {
    class Pair {
        int score, idx;
        Pair(int s, int i) {
            score = s;
            idx = i;
        }
    }

    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];

        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(score[i], i);
        }

        Arrays.sort(arr, (a, b) -> b.score - a.score);

        for (int i = 0; i < n; i++) {
            int idx = arr[i].idx;

            if (i == 0) res[idx] = "Gold Medal";
            else if (i == 1) res[idx] = "Silver Medal";
            else if (i == 2) res[idx] = "Bronze Medal";
            else res[idx] = String.valueOf(i + 1);
        }
        return res;
    }
}