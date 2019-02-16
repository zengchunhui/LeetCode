package medium.Matrix;

/**
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * <p>
 * Note: You can only move either down or right at any point in time.
 * <p>
 * Input:
 * [
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * Output: 7
 * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
 */
public class MinPathSum {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] numbers = new int[m][n];

        for (int i = m - 1; i > -1; i--) {
            for (int j = n - 1; j > -1; j--) {
                if (i == (m - 1) && j == (n - 1)) {
                    numbers[i][j] = grid[i][j];
                } else if (i == (m - 1)) {
                    numbers[i][j] = grid[i][j] + numbers[i][j + 1];
                } else if (j == (n - 1)) {
                    numbers[i][j] = grid[i][j] + numbers[i + 1][j];
                } else {
                    numbers[i][j] = grid[i][j] + Math.min(numbers[i+1][j],numbers[i][j+1]);
                }
            }
        }
        return numbers[0][0];
    }

    public static void main(String[] args) {
        MinPathSum minPathSum = new MinPathSum();
//        int[][] numbers = {
//                {1, 2, 3, 4},
//                {6, 4, 2, 9},
//                {5, 3, 6, 1}
//        };
        int[][] numbers =  {
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        int result = minPathSum.minPathSum(numbers);
        System.out.print(result);
    }
}
