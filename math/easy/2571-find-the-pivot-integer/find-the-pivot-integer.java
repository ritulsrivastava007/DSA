class Solution {
    public int pivotInteger(int n) {
        int Sum = n * (n + 1) / 2;
        int pivot = (int) Math.sqrt(Sum);
        if (pivot * pivot == Sum) {
            return pivot;
        } else {
            return -1;
        }
    }
}