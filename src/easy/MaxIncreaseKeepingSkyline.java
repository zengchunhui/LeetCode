package easy;

public class MaxIncreaseKeepingSkyline {

    /**
     * In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there.
     * We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings).
     * Height 0 is considered to be a building as well.
     *
     * At the end, the "skyline" when viewed from all four directions of the grid,
     * i.e. top, bottom, left, and right, must be the same as the skyline of the original grid.
     * A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance.
     *
     * Example:
     * Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
     * Output: 35
     * Explanation:
     * The grid is:
     * [ [3, 0, 8, 4],
     *   [2, 4, 5, 7],
     *   [9, 2, 6, 3],
     *   [0, 3, 1, 0] ]
     *
     * The skyline viewed from top or bottom is: [9, 4, 8, 7]
     * The skyline viewed from left or right is: [8, 7, 9, 3]
     *
     * The grid after increasing the height of buildings without affecting skylines is:
     *
     * gridNew = [ [8, 4, 8, 7],
     *             [7, 4, 7, 7],
     *             [9, 4, 8, 7],
     *             [3, 3, 3, 3] ]
     * */
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int xLen = grid.length;
        if(xLen==0){
            return 0;
        }
        int yLen = grid[0].length;
        int[] xMAx = new int[xLen];
        int[] yMAx = new int[yLen];
        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++){
                int temp = grid[i][j];
                if(temp > xMAx[i]){
                    xMAx[i] = temp;
                }
                if (temp > yMAx[j]){
                    yMAx[j] = temp;
                }
            }
        }

        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++){
                int temp = xMAx[i]>yMAx[j]?yMAx[j]:xMAx[i];
                int diff = temp - grid[i][j];
                result += diff>0?diff:0;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[][] grid = {{3,0, 8, 4},{2, 4, 5, 7},{9, 2, 6, 3},{0, 3, 1, 0} };
        int result = maxIncreaseKeepingSkyline(grid);
        System.out.println(result);
    }

}
