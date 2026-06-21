1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int max = 0;
4
5        for(int i = 0; i < accounts.length; i++) {
6            int sum = 0;
7            for(int j = 0; j < accounts[i].length; j++) {
8                sum += accounts[i][j];
9            }
10            max = Math.max(max, sum);
11        }
12        return max;
13    }
14}