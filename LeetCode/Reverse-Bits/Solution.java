1class Solution {
2    public int reverseBits(int n) {
3      int reverse = 0;
4      for(int i= 0; i<32; i++){
5        reverse = reverse << 1;
6        reverse = reverse | (n&1);
7        n=n>>1;
8      }  
9      return reverse;
10    }
11}