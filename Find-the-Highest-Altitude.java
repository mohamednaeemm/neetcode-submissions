1class Solution {
2    public int largestAltitude(int[] gain) {
3        int st = 0;
4        int max = 0;
5        int[] alt = new int[gain.length + 1];
6        alt[0] = 0;
7
8        for (int i = 1; i < alt.length; i++) {
9            st += gain[i - 1];
10            alt[i] = st;
11            if (st > max){
12                max = st;
13            }
14        }
15        return max;
16    }
17}