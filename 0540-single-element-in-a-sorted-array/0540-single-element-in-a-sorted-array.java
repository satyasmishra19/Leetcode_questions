class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans=0;
        if (nums.length == 1) return nums[0]; //for one element array
        if (nums[0] != nums[1]) return nums[0]; //for 1st element as unique
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1]; //for last element as unique
        for(int  i =1 ; i < nums.length-1 ; i++){
            if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1]){
                ans=nums[i];
            }
        }
        return ans;
    }
}