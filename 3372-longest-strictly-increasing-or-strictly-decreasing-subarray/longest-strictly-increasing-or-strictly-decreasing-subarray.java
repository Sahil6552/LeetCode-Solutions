class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int decr = 1;
        int incr = 1;
        int max = 1;
        int min = 1;
        for(int i = 1;i<nums.length;i++){
            
            if(nums[i]>nums[i-1]){
                max++;
            }
            else max=1;
            incr = Math.max(incr,max);
        }
        for(int i = 1;i<nums.length;i++){
            
            if(nums[i]<nums[i-1]){
                min++;
            }
            else min = 1;
            decr = Math.max(decr,min);
        }
        return Math.max(incr,decr);
    }
}