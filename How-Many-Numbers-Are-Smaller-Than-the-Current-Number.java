1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int[] ans = new int[nums.length];
4        int cnt = 0;
5
6        for(int i = 0; i < nums.length; i++) {
7            cnt = 0;
8            for(int j = 0; j < nums.length; j++) {
9                if (nums[i] > nums[j]) {
10                    cnt += 1;
11                } 
12            }
13            ans[i] = cnt;
14        }
15        return ans;
16    }
17}