class Solution {
    public boolean exist(char[][] board, String word) {
        int idx = 0;
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(solve(i,j,board,word,idx)) return true;
            }
        }
        return false;
    }
    public boolean solve(int i, int j, char[][] board, String word,int idx){
        if(idx==word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length ||board[i][j]=='#' ||board[i][j]!=word.charAt(idx)) return false;
        if(board[i][j]==word.charAt(idx)){
            char temp = board[i][j];
            board[i][j] = '#';
            if(solve(i+1,j,board,word,idx+1)){
                board[i][j] = temp;
                return true;
            }
            if(solve(i,j+1,board,word,idx+1)){
                board[i][j] = temp;
                return true;
            }
            if(solve(i-1,j,board,word,idx+1)){
                board[i][j] = temp;
                return true;
            }
            if(solve(i,j-1,board,word,idx+1)) {
                board[i][j] = temp;
                return true;
            }
            board[i][j] = temp;
            
        }
        return false;
    }
}