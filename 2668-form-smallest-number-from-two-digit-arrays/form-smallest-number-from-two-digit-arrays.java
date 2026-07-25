class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int common = 10;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    common = Math.min(common, nums1[i]);
                }
            }
        }
        if (common != 10) {
            return common;
        }
        int a = 10;
        for (int i = 0; i < nums1.length; i++) {
            a = Math.min(a, nums1[i]);
        }
        int b = 10;
        for (int i = 0; i < nums2.length; i++) {
            b = Math.min(b, nums2[i]);
        }
        return Math.min(a * 10 + b, b * 10 + a);
    }
}