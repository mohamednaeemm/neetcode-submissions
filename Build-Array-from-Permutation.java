1class Solution {
2    public int[] buildArray(int[] nums) {
3        int size = nums.length;
4        int[] newNums = new int[size];
5        for (int i = 0; i < size; i++) {
6            newNums[i] = nums[nums[i]];
7        }
8        return newNums;
9    }
10}