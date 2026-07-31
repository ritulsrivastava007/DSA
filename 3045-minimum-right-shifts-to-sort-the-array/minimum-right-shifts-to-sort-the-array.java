class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int[] arr = new int[n];
        int[] sorted = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = nums.get(i);
            sorted[i] = arr[i];
            map.put(arr[i], i);
        }
        Arrays.sort(sorted);
        int diff = -1;
        for (int i = 0; i < n; i++) {
            int originalIndex = map.get(sorted[i]);
            int currentDiff = (originalIndex - i + n) % n;
            if (diff == -1) {
                diff = currentDiff;
            } else if (diff != currentDiff) {
                return -1;
            }
        }
        return (n - diff) % n;
    }
}