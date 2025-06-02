class Solution {
    public int diagonalSum(int[][] mat) {
        int sumP = 0;
        int sumS = 0;

        for (int i = 0; i < mat.length; i++) {
            sumP += mat[i][i];
            sumS += mat[i][mat.length - 1 - i];
        }

        if (mat.length % 2 != 0) {
            return sumP + sumS - mat[mat.length / 2][mat.length / 2];
        }
        return sumP + sumS;
    }
}