class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int work = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                work++;
            }
        }
        return work;
    }
}