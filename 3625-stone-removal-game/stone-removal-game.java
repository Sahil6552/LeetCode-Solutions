class Solution {
    public boolean canAliceWin(int n) {
        int total = 10;
        int step = 0;
        while(n>0){
            if(n-total>=0){
                n=n-total;
                step++;
                total--;
            }
            else break;
        }
        if(step%2!=0) return true;
        return false;
    }
}