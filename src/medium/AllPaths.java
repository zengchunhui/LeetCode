package medium;

import java.util.ArrayList;
import java.util.List;

public class AllPaths {
    List<List<Integer>> result;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> carry = new ArrayList<>();
        result = new ArrayList<>();
        getPath(graph, 0, carry);
        return result;
    }

    private void getPath(int[][] graph, int next, List<Integer> path) {
        path.add(next);
        if (next == graph.length - 1) {
            result.add(new ArrayList<Integer>(path));
        } else {
            for (int i : graph[next]) {
                getPath(graph, i, path);
            }
        }
        path.remove(path.size() - 1);
    }
}
