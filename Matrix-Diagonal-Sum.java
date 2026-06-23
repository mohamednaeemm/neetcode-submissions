1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int sum = 0;
4        for (int i = 0; i < mat.length; i++) {
5            sum += mat[i][i];
6            sum += mat[i][mat.length - 1 - i];
7        }
8        int mid = ( mat.length - 1 ) / 2;
9        if (mat.length % 2 != 0) {
10            sum -= mat[mid][mid];
11        }
12        
13        return sum;
14    }
15}