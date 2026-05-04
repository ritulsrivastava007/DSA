class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] count=new int[nums.length+1];
        int dup=-1,mis=-1;

        for(int num:nums){
            count[num]++;
        }

        for(int i=1;i<=nums.length;i++){
            if(count[i] == 2){
                dup = i;
            }
            if(count[i] == 0){
                mis = i;
            }
        }
        return new int[]{dup, mis};
    }
}