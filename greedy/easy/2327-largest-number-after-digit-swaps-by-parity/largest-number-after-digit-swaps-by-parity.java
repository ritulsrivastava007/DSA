class Solution {
    public int largestInteger(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        List<Character> even = new ArrayList<>();
        List<Character> odd = new ArrayList<>();
        for (char c : arr) {
            if ((c - '0') % 2 == 0)
                even.add(c);
            else
                odd.add(c);
        }
        even.sort(Collections.reverseOrder());
        odd.sort(Collections.reverseOrder());
        int e = 0, o = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - '0') % 2 == 0)
                arr[i] = even.get(e++);
            else
                arr[i] = odd.get(o++);
        }
        return Integer.parseInt(new String(arr));
    }
}