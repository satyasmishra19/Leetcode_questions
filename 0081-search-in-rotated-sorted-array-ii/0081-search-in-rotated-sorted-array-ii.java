class Solution {
    public boolean search(int[] nums,int target) {
        int k = findpivotwithduplicates(nums);
        //3cases
        if (k==-1) {
            return binarysearch(nums,0,nums.length-1, target);
        }
        else if (nums[k] == target) {
            return true;
        }
        else if (target>=nums[0]) {
            return binarysearch(nums, 0, k-1, target);
        }else{
            return binarysearch(nums, k+1, nums.length-1, target);
        }
    }
    static boolean binarysearch(int[] nums,int start,int end,int target) {
        
        while (start<=end) {
            int mid=start+((end-start)/2);
            if (nums[mid]<target) {
                start=mid+1;
            }
            else if (nums[mid]>target) {
                end=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
    static int findpivotwithduplicates(int[] nums) {
        int start= 0;
        int end=nums.length-1;

        while (start<=end) {
            int mid=start+((end-start)/2);

            //4 cases
            if (mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            }
            else if (mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            }
            //if the duplicates elements are start,end,middle
            //just skip it
            if (nums[start]==nums[mid] && nums[mid]==nums[end]) {
                //check if start is pivot
                if (start<end && nums[start]>nums[start+1]) {
                    return start;
                }
                start++;
                if (end>start && nums[end]<nums[end-1]) {
                    return end;
                }
                end--;
            }
            //left side is sorted, so pivot should be in right
            else if(nums[start]<nums[mid] || (nums[start] == nums[mid] && nums[mid]>nums[end])){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}