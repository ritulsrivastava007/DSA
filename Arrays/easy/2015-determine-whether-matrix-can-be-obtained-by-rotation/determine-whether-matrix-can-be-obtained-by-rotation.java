class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {        
        for (int n = 0; n < 4;n++) {
            boolean same = true;
            for (int j = 0; j < mat.length && same; j++) {
                for (int k = 0; k < mat.length; k++) {
                    if (mat[j][k] != target[j][k]) {
                        same = false;
                        break;
                    }
                }
            }
            if (same) return true;
            int[][] temp = new int[mat.length][mat.length];
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    temp[j][mat.length - i - 1] = mat[i][j];
                }
            }
            mat = temp;
        }
        return false;
    }
}