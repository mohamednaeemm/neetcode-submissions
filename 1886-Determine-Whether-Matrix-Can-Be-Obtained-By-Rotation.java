class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int rot = 4;
        int n = mat.length;
        
        while (rot > 0) {
            if(Arrays.deepEquals(mat, target) == true) {
                return true;
            }

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][n - 1 - j];
                    mat[i][n - 1 - j] = temp;
                }
            }


            
            rot -= 1;
        }  
        return false;
    }
}