class Solution {
    public boolean halvesAreAlike(String s) {
        int range = s.length() / 2;
        int f1 = 0, f2 = 0;
        for (int i = 0; i < range; i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
                f1++;
            }
        }
        for (int i = range; i < s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
                f2++;
            }
        }
        return f1 == f2;
    }
}