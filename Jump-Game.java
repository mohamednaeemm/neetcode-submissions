1class Solution {
2    public boolean canJump(int[] nums) {
3        int jumpRemain = 0;
4        for(int i = 0; i < nums.length; i++) {
5            jumpRemain = Math.max(jumpRemain, nums[i]);
6            if (nums[i] + i >= nums.length - 1) {
7                return true;
8            } else if (nums[i] == 0 && jumpRemain == 0) {
9                return false;
10            }
11            jumpRemain--;
12        }
13        return false;
14    }
15}