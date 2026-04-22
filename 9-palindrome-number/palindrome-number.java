class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int pal=0;
        while(x>0){
            int y=x%10;
            pal = pal*10+y;
            x=x/10;
        }

        if(original==pal){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter any number: ");
        int x = sc.nextInt();
        
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(x);
        
        if(result){
            System.out.println("Given number is palindrome.");
        }
        else{
            System.out.println("Given number is not palindrome:");
        }
    }
}