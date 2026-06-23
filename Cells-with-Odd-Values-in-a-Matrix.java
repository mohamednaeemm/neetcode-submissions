1class Solution {
2    public int oddCells(int m, int n, int[][] indices) {
3        int[][] matrix = new int[m][n];
4
5        for (int[] ind : indices) {
6            int rowToIncrement = ind[0];
7            int colToIncrement = ind[1];
8
9            for (int j = 0; j < n; j++) {
10                matrix[rowToIncrement][j]++;
11            }
12
13            for (int i = 0; i < m; i++) {
14                matrix[i][colToIncrement]++;
15            }
16        }
17
18        int oddCount = 0;
19        for (int i = 0; i < m; i++) {
20            for (int j = 0; j < n; j++) {
21                if (matrix[i][j] % 2 != 0) {
22                    oddCount++;
23                }
24            }
25        }
26
27        return oddCount;
28
29    }
30}