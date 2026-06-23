1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        for(int[] row : image) {
4            int length = row.length;
5            for (int i = 0; i < (length / 2); i++) {
6                int store = row[i];
7                row[i] = row[length - 1 - i];
8                row[length - 1 - i] = store; 
9            }
10        }
11
12        for(int[] row : image) {
13            for (int i = 0; i < row.length; i++) {
14                if(row[i] == 0) {
15                   row[i] = 1;
16                } else {
17                    row[i] = 0;
18                }
19            }
20        }
21        return image;
22    }
23}