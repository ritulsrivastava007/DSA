class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a = s.toCharArray();
        for (int i = 0, j = a.length - 1; i < j;) {
            if (!Character.isLetter(a[i])) {
                i++;
            }
            else if (!Character.isLetter(a[j])) {
                j--;
            }
            else {
                char t = a[i];
                a[i++] = a[j];
                a[j--] = t;
            }
        }
        return new String(a);
    }
}