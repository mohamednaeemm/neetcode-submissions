1class Solution {
2    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
3        int cnt = 0;
4        for(int i = 0; i < items.size(); i++) {
5            if (ruleKey.equals("type")) {
6                if (ruleValue.equals(items.get(i).get(0))) {
7                    cnt += 1;
8                }
9            }
10
11            if (ruleKey.equals("color")) {
12                if (ruleValue.equals(items.get(i).get(1))) {
13                    cnt += 1;
14                }
15            }
16
17            if (ruleKey.equals("name")) {
18                if (ruleValue.equals(items.get(i).get(2))) {
19                    cnt += 1;
20                }
21            }
22        }
23        return cnt;
24    }
25}