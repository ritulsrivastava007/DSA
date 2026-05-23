class Solution {
    public int[] diStringMatch(String s) {
        int low = 0, high = s.length();
        int[] arr = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) == 'I' ? low++ : high--;
        }
        arr[s.length()] = low;
        return arr;
    }
}