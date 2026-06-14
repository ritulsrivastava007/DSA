class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max=0;
        int count=0;
        for (int[] rect:rectangles) {
            int side=Math.min(rect[0],rect[1]);
            if (side>max) {
                max=side;
                count=1;
            } else if (side==max) {
                count++;
            }
        }
        return count;
    }
}