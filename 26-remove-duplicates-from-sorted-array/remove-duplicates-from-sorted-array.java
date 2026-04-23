import java.util.Scanner;
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) 
        return 0;

        int j = 0; // pointer for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1; // new length
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int s = sc.nextInt();

        int[] nums= new int[s];
        for(int i=0; i<s;i++){
            nums[i]=sc.nextInt();
        }
        
        Solution sol = new Solution();
        int newLength = sol.removeDuplicates(nums);


        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}