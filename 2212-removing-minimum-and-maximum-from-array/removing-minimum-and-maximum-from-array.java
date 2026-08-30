class Solution {
    public int minimumDeletions(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        int lidx=-1;
        int sidx=-1;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                lidx=i;
            }
            if(arr[i]<min){
                min = arr[i];
                sidx=i;
            }
        }
        int b = Math.max(sidx,lidx)+1;
        int c = n-Math.min(sidx,lidx);
        int a = (Math.min(sidx,lidx)+1)+n-Math.max(sidx,lidx);
        int ans  = Math.min(a,Math.min(b,c));
        return ans;
    }
}