package medium.Matrix;

import java.util.*;

/**
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * 1.Each row must contain the digits 1-9 without repetition.
 * 2.Each column must contain the digits 1-9 without repetition.
 * 3.Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> infoSet = new HashSet<String>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                if(number != '.'){
                    String sub = "."+number+".";
                    if(!infoSet.add(sub+j) || !infoSet.add(i+sub) || !infoSet.add((i/3)+sub+(j/3))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
