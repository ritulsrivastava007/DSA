class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int[] md = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] days = new int[2];
        String[] dates = {date1, date2};
        for (int k = 0; k < 2; k++) {
            int y = Integer.parseInt(dates[k].substring(0, 4));
            int m = Integer.parseInt(dates[k].substring(5, 7));
            int d = Integer.parseInt(dates[k].substring(8));
            for (int i = 1971; i < y; i++)
                days[k] += (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) ? 366 : 365;
            for (int i = 1; i < m; i++) {
                days[k] += md[i - 1];
                if (i == 2 && (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)))
                    days[k]++;
            }
            days[k] += d;
        }
        return Math.abs(days[0] - days[1]);
    }
}