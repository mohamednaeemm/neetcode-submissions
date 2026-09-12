class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st = -1, end = -1;
        for (int i = 0; i < 2; i++) {
            int l = 0, r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if(nums[mid] > target) {
                    r = mid - 1;
                } else if (nums[mid] < target) {
                    l = mid + 1;
                } else {
                    if ( i == 0) {
                        st = mid;
                        r = mid - 1;
                    } else {
                        end = mid;
                        l = mid + 1;
                    }
                    
                }
            }
        }
        return new int[] {st , end};
    }
}