class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num3[] = new int[m+n];
        System.arraycopy(nums1, 0, num3, 0, m);
        System.arraycopy(nums2, 0, num3, m, n);
        Arrays.sort(num3);
        System.arraycopy(num3, 0, nums1, 0, m+n);
    }
}