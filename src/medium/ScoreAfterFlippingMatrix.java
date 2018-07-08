package medium;

import java.util.Map;

/**
 * We have a two dimensional matrix A where each value is 0 or 1.
 * <p>
 * A move consists of choosing any row or column,
 * and toggling each value in that row or column: changing all 0s to 1s, and all 1s to 0s.
 * <p>
 * After making any number of moves, every row of this matrix is interpreted as a binary number,
 * and the score of the matrix is the sum of these numbers.
 * <p>
 * Return the highest possible score.
 */
public class ScoreAfterFlippingMatrix {

    /**
     * code of other
     * int r = A.length, c = A[0].length, ans =0, sum=0;
     * for(int j=0;j<c;j++){
     * sum=0;
     * for(int i=0;i<r;i++){
     * sum+=A[i][j]^A[i][0];
     * }
     * ans+=Math.max(sum,r-sum)*(1<<(c-1-j));
     * }
     * return ans;
     */
    public int matrixScore(int[][] A) {
        int rowSize = A.length;
        int colSize = A[0].length;
        int result = 0;
        for (int i = 0; i < rowSize; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < colSize; j++) {
                    if (A[i][j] == 1) {
                        A[i][j] = 0;
                    } else {
                        A[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < colSize; i++) {
            int zeroNum = 0;
            int oneNum = 0;
            for (int j = 0; j < rowSize; j++) {
                if (A[j][i] == 0) {
                    zeroNum++;
                } else {
                    oneNum++;
                }
            }
            if (zeroNum > oneNum) {
                flipper(A, i, rowSize);
            }
        }

        for (int i = 0; i < rowSize; i++) {
            result += toInt(A[i]);
        }
        return result;
    }

//    public int matrixScore(int[][] A) {
//        int r = A.length, c = A[0].length, ans =0, sum=0;
//        for(int j=0;j<c;j++){
//            sum=0;
//            for(int i=0;i<r;i++){
//                sum+=A[i][j]^A[i][0];
//            }
//            ans+=Math.max(sum,r-sum)*(1<<(c-1-j));
//        }
//        return ans;
//    }


    private void flipper(int[][] num, int col, int side) {
        for (int i = 0; i < side; i++) {
            if (num[i][col] == 1) {
                num[i][col] = 0;
            } else {
                num[i][col] = 1;
            }
        }
    }

    private int toInt(int[] num) {
        int result = 0;
        int length = num.length;
        for (int i = length - 1; i >= 0; i--) {
            if (num[i] == 1) {
                result += Math.pow(2, length - i - 1);
            }
        }
        return result;
    }
}
