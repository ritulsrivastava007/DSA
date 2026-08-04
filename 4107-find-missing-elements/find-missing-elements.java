import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int first = nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == first) {
                while (i < nums.length && nums[i] == first) {
                    i++;   
                }
                first++;
            } else {
                ans.add(first);
                first++;
            }
        }
        return ans;
    }
}