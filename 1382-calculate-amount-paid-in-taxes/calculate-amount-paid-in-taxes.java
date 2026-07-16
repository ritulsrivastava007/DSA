class Solution {
    public double calculateTax(int[][] brackets, int income) {
        int prev = 0;
        double tax = 0;
        for (int i = 0; i < brackets.length; i++) {
            int upper = brackets[i][0];
            int percent = brackets[i][1];
            int taxable = Math.min(income, upper) - prev;
            if (taxable > 0) {
                tax += taxable * percent / 100.0;
            }
            prev = upper;
            if (income <= upper) break;
        }
        return tax;
    }
}