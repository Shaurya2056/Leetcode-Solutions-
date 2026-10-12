1class Solution {
2    public int missingNumber(int[] nums) {
3        int xOR=0;
4        for(int i=0;i<=nums.length;i++){
5            xOR=xOR^i;
6        }
7        for(int i=0;i<nums.length;i++){
8            xOR=xOR^nums[i];
9        }
10        return xOR;
11    }
12}