class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int monday = 1;
        while (n > 0) {
            int deposit = monday;
            for (int i = 0; i < 7 && n > 0; i++) {
                sum += deposit;
                deposit++;
                n--;
            }
            monday++;
        }
        return sum;
    }
}