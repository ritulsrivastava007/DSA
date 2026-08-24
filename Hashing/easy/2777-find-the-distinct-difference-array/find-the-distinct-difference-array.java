import java.util.*;
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] diff = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            prefix[i] = set.size();
        }
        set.clear();
        for (int i = n - 1; i >= 0; i--) {
            set.add(nums[i]);
            suffix[i] = set.size();
        }
        for (int i = 0; i < n; i++) {
            int suffixDistinct = (i == n - 1) ? 0 : suffix[i + 1];
            diff[i] = prefix[i] - suffixDistinct;
        }
        return diff;
    }
}