class Solution {
    public int countSpecialIntegers(int[] nums) {
         int n = nums.length;
      int ans = 0;
      HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
      for(int  i = 0;i<n;i++){
         if(!map.containsKey(nums[i])){
            map.put(nums[i],new ArrayList<Integer>());
         }
         map.get(nums[i]).add(i);
      }
      for(ArrayList<Integer> list:map.values()){
         if(list.size()<3) continue;
         else{
            int a = list.get(0);
            int b = list.get(1);
            int c = b-a;
            for(int i = 1;i<list.size();i++){
                if(list.get(i)-list.get(i-1)!=c) break;
                if(i==list.size()-1) ans++;
            }
         }
      }
      return ans;
    }
}