class Solution {
    public int uniquePathsIII(int[][] grid) {
        int zero = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    zero++;
                }
            }
        }
        int idx1 = -1;
        int  idx2 = -1;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        return solve(idx1,idx2,grid,zero);
    }
    public int solve(int i, int j,int[][] grid, int zero){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==-2 || grid[i][j]==-1) return 0;
        if(grid[i][j]==2){
            if(zero==0){
                return 1;
            }
            else return 0;
        }
        
       int temp=  grid[i][j];
       grid[i][j] = -2;
       int ans = 0;
       if(temp==0){
        zero--;
       }
       ans+=solve(i+1,j,grid,zero);
       ans+=solve(i,j-1,grid,zero);
       ans+=solve(i-1,j,grid,zero);
       ans+=solve(i,j+1,grid,zero);
       grid[i][j] = temp;
       return ans;
    }
}