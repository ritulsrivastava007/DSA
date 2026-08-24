class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count = 0;
        int[] first = new int[10];
        for(int num : nums) {
            int last = num % 10;
            for(int i = 1; i <= 9; i++) {
                if(first[i] > 0 && gcd(i, last) == 1) {
                    count += first[i];
                }
            }
            int digit = num;
            while(digit >= 10) {
                digit /= 10;
            }
            first[digit]++;
        }
        return count;
    }
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}