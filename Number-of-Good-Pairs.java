1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int good = 0;
4
5        for(int i = 0; i < nums.length - 1; i++) {
6            for(int j = i + 1; j < nums.length; j++) {
7                if(nums[i] == nums[j]) {
8                    good += 1;
9                }
10            }
11        }
12        return good;
13    }
14}