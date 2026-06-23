1class Solution {
2    public boolean checkIfPangram(String sentence) {
3        if(sentence.length() < 26) {
4            return false;
5        }
6        boolean[] seen = new boolean[26];
7
8        for(char c : sentence.toCharArray()) {
9            seen[c - 'a'] = true;
10        }
11
12        for(boolean check : seen) {
13            if(!check) {
14                return false;
15            }
16        }
17        return true;
18    }
19}