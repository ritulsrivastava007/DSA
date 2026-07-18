class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] map = new int[1001];
        List<List<Integer>> ans = new ArrayList<>();
        for(int[] item : items1) {
            map[item[0]] = item[1];
        }
        for(int[] item : items2) {
            map[item[0]] += item[1];
        }
        for(int i = 1; i < 1001; i++) {
            if(map[i] != 0) {
                ans.add(List.of(i, map[i]));
            }
        }
        return ans;
    }
}