class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;

        while (i < j) {
            while (i < j && "aeiouAEIOU".indexOf(a[i]) == -1) i++;
            while (i < j && "aeiouAEIOU".indexOf(a[j]) == -1) j--;

            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
        return new String(a);
    }
}