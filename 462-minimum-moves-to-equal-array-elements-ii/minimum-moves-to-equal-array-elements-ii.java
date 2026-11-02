class Solution {
    public int minMoves2(int[] arr) {
       int n = arr.length;
       Arrays.sort(arr);
       int mid = 0;
       int no = 0;
       if(n%2==0){
        no = arr[n/2-1];
       }
       else{
        no = arr[n/2];
       }
       int count = 0;
       for(int i = 0;i<n;i++){
        count+=Math.abs(no-arr[i]);
       }
       return count;
    }
}