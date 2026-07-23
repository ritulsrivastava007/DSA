class Solution {
    public int alternateDigitSum(int n) {
        int num = 0;
        while (n > 0) {
            num = num * 10 + n % 10;
            n /= 10;
        }
        int i = 0, sum = 0;
        while (num > 0) {
            if (i % 2 == 0) {
                sum += num % 10;
            } else {
                sum -= num % 10;
            }
            num /= 10;
            i++;
        }
        return sum;
    }
}