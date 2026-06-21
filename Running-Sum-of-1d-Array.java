1class Solution {
2    public int[] runningSum(int[] nums) {
3        int sum = 0;
4        int[] sumArr = new int[nums.length];
5        for(int i = 0; i < nums.length; i++) {
6            sumArr[i] = nums[i] + sum;
7            sum += nums[i];
8        } 
9        return sumArr;
10    }
11}