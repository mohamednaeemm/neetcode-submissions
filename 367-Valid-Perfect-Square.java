class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 0, r = num / 2 + 1;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long res = mid * mid;
            if(res > num) {
                r = mid - 1;
            } else if (res < num) {
                l = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}