import java.util.Scanner;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            int x=target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                 if(nums[j]==x){
                return new int[]{i, j};
            }
            }
        }
        return new int[0];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int s= sc.nextInt();

        int nums[] = new int[s];
        for(int i=0;i<s;i++){
            System.out.print("Enter element no. "+(i+1)+":");
            nums[i]=sc.nextInt();
        }

        System.out.print("Enter number you want as sum: ");
        int target = sc.nextInt();

        int r[]= new int[2];
        r = Solution.twoSum(nums,target);

        if(r.length==2){
            System.out.println("["+(r[0]+1)+"]"+"["+(r[1]+1)+"]");
        }
        else{
            System.out.println("invalid input.");
        }
    }
}
