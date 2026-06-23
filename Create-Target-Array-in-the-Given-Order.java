1class Solution {
2    public int[] createTargetArray(int[] nums, int[] index) {
3        List<Integer> list = new ArrayList<>();
4        int[] target = new int[nums.length];
5
6        for(int i = 0; i < index.length; i++) {
7            list.add(index[i], nums[i]); 
8        }
9
10         for (int i = 0; i < nums.length; i++) {
11            target[i] = list.get(i);
12        }
13        return target;
14    }
15}