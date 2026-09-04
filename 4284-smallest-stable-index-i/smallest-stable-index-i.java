class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int idx=-1;
        for(int i = 0;i<n;i++){
            int small = Integer.MAX_VALUE;
            int lar = Integer.MIN_VALUE;
            for(int j = 0;j<=i;j++){
                if(nums[j]>lar){
                    lar = nums[j];
                }
            }
            for(int l = i;l<n;l++){
                if(nums[l]<small){
                    small= nums[l];
                }
            }
            if((lar-small)<=k){
                idx=i;
                break;
            }
        }
        return idx;
    }
}