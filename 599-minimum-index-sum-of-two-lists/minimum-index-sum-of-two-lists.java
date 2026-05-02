import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int sum = i + j;

                    if (sum < minSum) {
                        result.clear();              
                        result.add(list1[i]);
                        minSum = sum;
                    } else if (sum == minSum) {
                        result.add(list1[i]);        
                    }
                }
            }
        }
        return result.toArray(new String[0]);
    }
}