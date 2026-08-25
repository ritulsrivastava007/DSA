class Solution {
    public int countTime(String time) {
        int hourChoices = 1;
        int minuteChoices = 1;
        char h1 = time.charAt(0);
        char h2 = time.charAt(1);
        if (h1 == '?' && h2 == '?') {
            hourChoices = 24;
        } else if (h1 == '?') {
            hourChoices = (h2 < '4') ? 3 : 2;
        } else if (h2 == '?') {
            hourChoices = (h1 == '2') ? 4 : 10;
        }
        char m1 = time.charAt(3);
        char m2 = time.charAt(4);
        if (m1 == '?') {
            minuteChoices *= 6;
        }
        if (m2 == '?') {
            minuteChoices *= 10;
        }
        return hourChoices * minuteChoices;
    }
}