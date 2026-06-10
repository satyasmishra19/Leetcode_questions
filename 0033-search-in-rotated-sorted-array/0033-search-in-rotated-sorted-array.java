class Solution {
    static int search(int[] nums,int target) {
        int k = findpivot(nums);
        //3cases
        if (k==-1) {
            return binarysearch(nums,0,nums.length-1, target);
        }
        else if (nums[k] == target) {
            return k;
        }
        else if (target>=nums[0]) {
            return binarysearch(nums, 0, k-1, target);
        }else{
            return binarysearch(nums, k+1, nums.length-1, target);
        }
    }
    static int binarysearch(int[] nums,int start,int end,int target) {
        
        while (start<=end) {
            int mid=start+((end-start)/2);
            if (nums[mid]<target) {
                start=mid+1;
            }
            else if (nums[mid]>target) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int findpivot(int[] nums) {
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
            else if (nums[mid]>=nums[start]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}