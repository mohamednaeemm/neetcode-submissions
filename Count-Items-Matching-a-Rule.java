1class Solution {
2    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
3        int index = 0;
4        int cnt = 0;
5
6        if (ruleKey.equals("type")) {
7            index = 0;
8        } else if(ruleKey.equals("color")) {
9            index = 1;
10        } else {
11            index = 2;
12        }
13
14        for(List<String> item : items) {
15            if (item.get(index).equals(ruleValue)) {
16                cnt += 1;
17            }
18        }
19        return cnt;
20    }
21}