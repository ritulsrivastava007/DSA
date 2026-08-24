class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int num = low; num <= high; num++) {
            String s = Integer.toString(num);
            if (s.length() % 2 != 0)
                continue;
            int sum1 = 0, sum2 = 0;
            int n = s.length() / 2;
            for (int i = 0; i < n; i++) {
                sum1 += s.charAt(i) - '0';
                sum2 += s.charAt(i + n) - '0';
            }
            if (sum1 == sum2)
                count++;
        }
        return count;
    }
}