class Solution {
    public int specialArray(int[] nums) {
        int l =  0, r = nums.length;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            int cnt = 0;
            for (int num : nums) {
                if (num >= mid) {
                    cnt++ ;
                }
            }
            if (cnt == mid) {
                return mid;
            }
            if (cnt > mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}