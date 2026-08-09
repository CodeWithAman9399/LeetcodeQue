class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        solve(board,0,ans);
        return ans;
    }
    static void solve(boolean [] [] board,int row ,List<List<String>> ans){
        if(row ==board.length){
           List<String> list = new ArrayList<>();

            for (boolean[] r : board) {

                StringBuilder sb = new StringBuilder();

                for (boolean element : r) {
                    if (element) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                list.add(sb.toString());
            }
             ans.add(list);
              return;
             
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board ,row,col)){
                board[row][col] = true;
                solve(board,row+1,ans);
                board[row][col] = false;
            }
        }

    }
    static boolean isSafe(boolean[][ ] board, int row, int col){
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }

        int maxLeft = Math.min(row,col);
        for (int i = 0; i <= maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        int maxRight = Math.min(row, board.length-1-col);
        for (int i = 0; i <=maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}