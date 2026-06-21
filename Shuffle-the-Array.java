1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] newNums = new int[nums.length];
4        for(int i = 0; i < (nums.length) / 2; i++) {
5            newNums[2 * i] = nums[i];
6            newNums[2 * i + 1] = nums[i + n];
7        }
8        return newNums;
9    }
10}