import java.util.*;
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int freq = 1;
        int start = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                freq++;
            } 
            else {
                if (freq >= 3) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(start);
                    temp.add(i - 1);
                    ans.add(temp);
                }
                start = i;
                freq = 1;
            }
        }
        if (freq >= 3) {
            List<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(s.length() - 1);
            ans.add(temp);
        }
        return ans;
    }
}