class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        solve(board, 0 ,result);
        return result;
    }
    private void solve(boolean[][] board, int row, List<List<String>> result){
        if( row == board.length){
            result.add(display(board));
            return;
        }
        for(int col = 0; col< board.length; col++){
            if( isSafe(board , row, col)){
                board[row][col] = true;
                solve(board, row+1, result);
                board[row][col] = false;
            }
        }
    }
    private boolean isSafe(boolean[][] board, int row, int col){
        for(int i=0; i<row; i++){
            if( board[i][col]){
                return false;
            }
        }
            // diagonal left
            int maxleft = Math.min(row, col);
            for(int i=1; i<= maxleft; i++){
                if(board[row-i][col-i]){
                    return false;
                }
            }
            // rigth
            int maxright = Math.min(row, board.length-col-1);
            for(int i=1; i<= maxright; i++){
                if(board[row-i][col+i]){
                    return false;
                }
            }
            return true;
            }
    private List<String> display(boolean[][] board){
        List<String> rows = new ArrayList<>();
        for(boolean[] row : board){
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? 'Q' : '.');
            }
            rows.add(sb.toString());
        }
        return rows;

    }
}