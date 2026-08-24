import java.util.Arrays;
class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int[][] mat1 = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            mat1[i] = mat[i].clone();
        }
        while (k > 0) {
            for (int i = 0; i < mat.length; i++) {
                if (i % 2 == 0) {
                    int temp = mat1[i][0];
                    for (int j = 0; j < mat1[i].length - 1; j++) {
                        mat1[i][j] = mat1[i][j + 1];
                    }
                    mat1[i][mat1[i].length - 1] = temp;
                } else {
                    int temp = mat1[i][mat1[i].length - 1];
                    for (int j = mat1[i].length - 1; j > 0; j--) {
                        mat1[i][j] = mat1[i][j - 1];
                    }
                    mat1[i][0] = temp;
                }
            }
            k--;
        }
        return Arrays.deepEquals(mat, mat1);
    }
}