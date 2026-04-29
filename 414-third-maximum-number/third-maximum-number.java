import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        if (list.size() < 3) {
            int max = list.get(0);
            for (int num : list) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        int max = 0;

        for (int j = 0; j < 2; j++) {
            max = list.get(0);

            for (int num : list) {
                if (num > max) {
                    max = num;
                }
            }

            list.remove(Integer.valueOf(max));
        }

        max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}