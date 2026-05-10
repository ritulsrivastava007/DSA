import java.util.ArrayList;
class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (!arr.contains(n)) {
            arr.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}