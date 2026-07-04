1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        int[][] trMatrix = new int[cols][rows];
6
7        for(int i = 0; i < rows; i++){
8            for(int j = 0; j < cols; j++) {
9                trMatrix[j][i] = matrix[i][j];
10            }
11        }
12        return trMatrix;
13    }
14}