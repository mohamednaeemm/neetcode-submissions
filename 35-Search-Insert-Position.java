class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, ans = r + 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
                ans = mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }
        
        }
        return ans;
    }
}