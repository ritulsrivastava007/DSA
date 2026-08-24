import java.util.*;
class Solution {
    int ans = Integer.MAX_VALUE;
    boolean[] visited;
    public int minScore(int n, int[][] roads) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] road : roads) {
            graph.putIfAbsent(road[0], new ArrayList<>());
            graph.putIfAbsent(road[1], new ArrayList<>());
            graph.get(road[0]).add(new int[]{road[1], road[2]});
            graph.get(road[1]).add(new int[]{road[0], road[2]});
        }
        visited = new boolean[n + 1];
        dfs(1, graph);
        return ans;
    }
    private void dfs(int node, Map<Integer, List<int[]>> graph) {
        visited[node] = true;
        for (int[] next : graph.get(node)) {
            ans = Math.min(ans, next[1]);
            if (!visited[next[0]]) {
                dfs(next[0], graph);
            }
        }
    }
}