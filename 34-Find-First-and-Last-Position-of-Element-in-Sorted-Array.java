class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = findBound(nums, target, true);
        if (start == -1) return new int[]{-1, -1};
        int end = findBound(nums, target, false);
        return new int[] {start, end};
    }
    private int findBound(int[] nums, int target, boolean isStart) {
        int l = 0, r = nums.length - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if(nums[mid] == target) {
                if (isStart) {
                    ans = mid;
                    r = mid - 1;
                } else {
                    ans = mid;
                    l = mid + 1;
                }
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
    
    
}