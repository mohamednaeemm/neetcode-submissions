class Solution {
    public int arrangeCoins(int n) {
        int l = 0, r = n, ans = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long k =(long) mid * (mid + 1) / 2;
            if (k < n) {
                ans = mid;
                l = mid + 1;
            } else if ( k > n) {
                r = mid - 1;
            } else {
                return mid;
            }

        }
        return ans;
    }
}