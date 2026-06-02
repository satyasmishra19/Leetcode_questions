class Solution {
    public int findPeakElement(int[] nums) {
        int start= 0;
        int end=nums.length-1;
        
        while (start<end) {
            int mid=start+((end-start)/2);
            if (nums[mid]<=nums[mid+1]) {
                //increasing part of an array
                start=mid+1;
            }
            else {
                //decreasing part of an array and may be the ans
                end=mid;
            }
        }
        return start;
    }
}