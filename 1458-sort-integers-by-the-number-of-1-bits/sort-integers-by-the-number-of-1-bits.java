class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] a = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(a, (x, y) -> Integer.bitCount(x) == Integer.bitCount(y) ? x - y : Integer.bitCount(x) - Integer.bitCount(y));
        for (int i = 0; i < arr.length; i++) arr[i] = a[i];
        return arr;
    }
}