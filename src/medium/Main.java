package medium;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] A = {{1,2}, {2}, {3,4}, {4},{}};
        AllPaths paths = new AllPaths();
        List<List<Integer>> result = paths.allPathsSourceTarget(A);
        System.out.println(result.toArray());
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A[0].length; j++) {
//                System.out.print(A[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println(result);
    }
}
