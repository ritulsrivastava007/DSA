class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int dist = 0;
        while (mainTank > 0) {
            if (mainTank >= 5) {
                dist += 50;
                mainTank -= 5;
                if (additionalTank > 0) {
                    mainTank++;      
                    additionalTank--;
                }
            } else {
                dist += mainTank * 10;
                break;
            }
        }
        return dist;
    }
}