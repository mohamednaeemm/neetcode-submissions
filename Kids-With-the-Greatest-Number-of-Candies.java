1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        List<Boolean> list = new ArrayList<>();
4
5        int max = candies[0];
6
7        for (int i = 0; i < candies.length; i++) {
8            if (candies[i] > max) {
9                max = candies[i];
10            }
11        }
12
13        for(int i = 0; i < candies.length; i++) {
14            if (candies[i] + extraCandies >= max) {
15                list.add(true);
16            } else {
17                list.add(false);
18            }
19        }
20        return list;
21    }
22}