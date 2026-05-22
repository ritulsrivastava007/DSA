class RecentCounter {
    private static final int[] records = new int[10000]; //
    private int beg;
    private int end;
    public RecentCounter() {        
        beg = 0;
        end = 0;
    }
    public int ping(int t) {
        while (beg < end && (t - records[beg] > 3000)) { 
            beg++;
        }
        records[end++] = t; 
        return end - beg; 
    }
}