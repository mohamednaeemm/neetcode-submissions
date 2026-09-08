class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for (int[] row : grid) {
            int l = 0, r = grid[0].length - 1, ansStep = 0;
            while(l <= r) {
                int mid = l + (r - l) / 2;
                if (row[mid] < 0) {
                    r = mid - 1;
                    ansStep = grid[0].length - mid;
                } else {
                    l = mid + 1;
                }
            }
            ans += ansStep;
            ansStep = 0;
        }
        return ans;
    }
}