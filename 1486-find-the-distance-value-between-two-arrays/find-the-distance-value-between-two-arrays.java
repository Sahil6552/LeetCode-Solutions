class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        int n = arr1.length;
        int m = arr2.length;
        for(int i = 0;i<n;i++){
            int j = 0;
            while(j<m){
                if(Math.abs(arr1[i]-arr2[j])<=d) break;
                if(j==m-1) ans++;
                j++;
            }
        }
        return ans;
    }
}