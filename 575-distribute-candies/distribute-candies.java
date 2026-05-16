class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int types = 1;
        for(int i = 1; i < candyType.length; i++){
            if(candyType[i] != candyType[i - 1]){
                types++;
            }
        }
        return Math.min(types, candyType.length / 2);
    }
}