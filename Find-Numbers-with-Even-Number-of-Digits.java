1class Solution {
2    public int findNumbers(int[] nums) {
3        int cnt = 0;
4        for(int i = 0; i < nums.length; i++){
5            String str = Integer.toString(nums[i]);
6            int strC = str.length();
7            if (strC % 2 == 0) {
8                cnt += 1;
9            }
10        }
11        return cnt;
12    }
13}