class TicTacToe {

    int[] rows;
    int[] cols;
    int diag;
    int antiDiag;
    int n = 0;
        
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        rows = new int[n];
        cols = new int[n];;
        diag = 0;
        antiDiag = 0;
        this.n = n;
    }
    
    /** Player {player} makes a move at ({row}, {col}).
        @param row The row of the board.
        @param col The column of the board.
        @param player The player, can be either 1 or 2.
        @return The current winning condition, can be either:
                0: No one wins.
                1: Player 1 wins.
                2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int move = player == 1 ? 1 : -1;
        rows[row] += move;
        cols[col] += move;
        if (row == col) diag += move;
        if (col == n - row - 1) antiDiag += move;
        
        if (rows[row] == n || cols[col] == n || diag == n || antiDiag == n) {
            return 1;
        } else if (rows[row] == -n || cols[col] == -n || diag == -n || antiDiag == -n) {
            return 2;
        } else return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
