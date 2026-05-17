import java.util.*;
class KthLargest {
    List<Integer> list = new ArrayList<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int n : nums) {
            list.add(n);
        }
        Collections.sort(list);
    }
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - k);
    }
}