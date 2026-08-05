class Solution {
    HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
    HashSet<Integer> suspicious = new HashSet<>();
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : invocations) {
            graph.get(edge[0]).add(edge[1]);
        }
        dfs(k);
        for (int[] edge : invocations) {
            int from = edge[0];
            int to = edge[1];
            if (!suspicious.contains(from) && suspicious.contains(to)) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspicious.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
    private void dfs(int node) {
        if (suspicious.contains(node))
            return;
        suspicious.add(node);
        for (int next : graph.get(node)) {
            dfs(next);
        }
    }
}