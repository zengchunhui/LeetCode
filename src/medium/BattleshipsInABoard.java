package medium;

/**
 * Given an 2D board, count how many battleships are in it.
 * The battleships are represented with 'X's, empty slots are represented with '.'s. You may assume the following rules:
 * You receive a valid board, made of only battleships or empty slots.
 * Battleships can only be placed horizontally or vertically.
 * In other words, they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
 * At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
 */
public class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        if (board == null || board.length == 0) return 0;
        int m = board.length, n = board[0].length;
        if (n == 0) return 0;

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X') {
//                    int k = j+1;
//                    while (k < n && board[i][k] == 'X') k++;
//                    if(i == m-1 || k>j+1){
//                        count++;
//                        j = k - 1;
//                    }else if(i < m - 1 && board[i + 1][j] == '.')
//                        count++;
                    if((i==(m-1) || board[i+1][j]=='.')&&((j==(m-1) || board[i][j+1]=='.'))){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
