class Solution {
    public boolean uniformArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        if(min%2==1){
            return true;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==1){
                return false;
            }
        }
        return true;
    }
}