class Solution {
    public int sumOfPrimesInRange(int n) {
        int st = n;
      int ans = 0;
      int rev =0;
      while(n>0){
         int rem = n%10;
         rev = rev*10+rem;
         n/=10;
      }
      if(rev>st){
         for(int i = st;i<=rev;i++){
            if(i<=1)  continue;
            boolean isPrime = true;
            for(int j = 2;j<=Math.sqrt(i);j++){
               if(i%j==0){
                  isPrime=false;
                  break;
               }
            }
            if(isPrime){
               ans+=i;
            }
         }
      }
      else{
         for(int i = rev;i<=st;i++){
            if(i<=1)  continue;
            boolean isPrime = true;
            for(int j = 2;j<=Math.sqrt(i);j++){
               if(i%j==0){
                  isPrime=false;
                  break;
               }
            }
            if(isPrime){
               ans+=i;
            }
         }
      }
      return ans;
    }
}