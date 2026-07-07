class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] positions = new int[2];
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        return new int[]{left, right};
    }

    private int binarySearch(int[] nums, int target, boolean leftBias) {
        int l = 0, r = nums.length - 1, i = -1;

        while (l <= r) {
            int m = (r + l) / 2; 
            if(nums[m] < target) {
                l = m + 1;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                i = m;
                if (leftBias) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }
        return i;
    }
}