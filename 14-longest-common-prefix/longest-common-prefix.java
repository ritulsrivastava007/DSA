import java.util.Scanner;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        int s = strs.length;
        if (s == 0) return "";

        char res[] = new char[100];
        int k = 0;

        for (int j = 0; j < strs[0].length(); j++) {

            char ch = strs[0].charAt(j);

            boolean isCommon = true;

            for (int i = 1; i < s; i++) {

                if (j >= strs[i].length() || strs[i].charAt(j) != ch) {
                    isCommon = false;
                    break;
                }
            }

            if (isCommon) {
                res[k++] = ch;
            } else {
                break;
            }
        }

        return new String(res, 0, k);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int s = sc.nextInt();
        sc.nextLine();

        String strs[] = new String[s];

        for (int i = 0; i < s; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            strs[i] = sc.nextLine();
        }

        Solution sol = new Solution();
        String result = sol.longestCommonPrefix(strs);

        if (result.length() == 0) {
            System.out.println("No common letters found.");
        } else {
            System.out.println("Common letters: " + result);
        }

        sc.close();
    }
}