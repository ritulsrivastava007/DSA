class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] intersect = new int[nums1.length];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersect[k] = nums1[i];
                    k++;

                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = intersect[i];
        }

        return result;
    }
}