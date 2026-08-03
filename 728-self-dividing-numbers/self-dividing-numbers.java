class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int n = i, c1 = 0, count = 0;
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0 && i % digit == 0) {
                    count++;
                }
                c1++;
                n /= 10;
            }
            if (c1 == count) {
                ans.add(i);
            }
        }
        return ans;
    }
}