class Solution {
    public int countTime(String time) {
        String hrs = time.substring(0, 2);
        String mins = time.substring(3, 5);
        int hourCount = 0;
        int minuteCount = 0;
        for (int h = 0; h < 24; h++) {
            String cur = String.format("%02d", h);
            if ((hrs.charAt(0) == '?' || hrs.charAt(0) == cur.charAt(0)) &&
                (hrs.charAt(1) == '?' || hrs.charAt(1) == cur.charAt(1))) {
                hourCount++;
            }
        }
        for (int m = 0; m < 60; m++) {
            String cur = String.format("%02d", m);
            if ((mins.charAt(0) == '?' || mins.charAt(0) == cur.charAt(0)) &&
                (mins.charAt(1) == '?' || mins.charAt(1) == cur.charAt(1))) {
                minuteCount++;
            }
        }
        return hourCount * minuteCount;
    }
}