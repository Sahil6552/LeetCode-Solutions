class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0;
        String ans= "";
        int count1=0;
        int min = Integer.MAX_VALUE;
        while(j<n){
            if(s.charAt(j)=='1'){
                count1++;
            }
            if(count1>k){
                while(count1>k){
                    if(s.charAt(i)=='1'){
                        count1--;
                    }
                    i++;
                }
            }
            if(count1==k){
                while(i<=j && s.charAt(i)=='0'){
                    i++;
                }
                int minimum = j-i+1;
                String curr = s.substring(i,j+1);
                if(minimum<min){
                    min = minimum;
                    ans=curr;
                }
                else if(minimum==min && curr.compareTo(ans)<0){
                    ans = curr;
                }
            }
            j++;
        }
        return ans;
    }
}