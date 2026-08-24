class Solution {
    public int kItemsWithMaximumSum(int numOnes,int numZeros,int numNegOnes,int k){
        int sum = 0;
        int take = Math.min(k, numOnes);
        sum += take;
        k -= take;
        take = Math.min(k, numZeros);
        k -= take;
        sum -= k;
        return sum;
    }
}