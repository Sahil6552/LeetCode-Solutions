class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
      int count = 0;
      int window = n/2;
      int totsum = 0;
      for(int i = 0;i<n;i++){
         totsum+=nums[i];
      }
      int sum = 0;
      for(int i = 0;i<window;i++){
         sum+=nums[i];
      }
      for(int i = 0;i<n;i++){
         if(sum>(totsum-sum)) count++;
         sum = sum-nums[i]+nums[(i+window)%n];
      }
      return count;
    //     int n = nums.length;
    //   int count = 0;
    //   for(int r = 0;r<n/2;r++){
    //      int[] rotated = new  int[n];
    //      for(int i = 0;i<n;i++){
    //         rotated[i] = nums[(i+r)%n];
    //      }
    //      int firstsum = 0;
    //      int secsum = 0;
    //      for(int i = 0;i<n/2;i++){
    //         firstsum+=rotated[i];
    //      }
    //      for(int i = n/2;i<n;i++){
    //         secsum+=rotated[i];
    //      }
    //      if(firstsum>secsum) count++;
    //      if(secsum>firstsum) count++;
    //   }
    //   return count;
        
    }
}