class Solution {
    public int numWaterBottles(int num, int exch) {
        int ans = 0;
      int full = num;
      int empty = 0;
        while(num>0){
            ans+=num;
            empty+=num;
            num = empty/exch;
            empty = empty%exch;
            // empty+=num;
        }
        return  ans;
    }
}