class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        boolean negative = num < 0;
        num = Math.abs(num);

        String binary = "";
        while (num > 0) {
            binary = (num % 7) + binary;
            num = num / 7;
        }
        return negative ? "-" + binary : binary;
    }
}