class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
       int num = 0;
       int count = 0;
        for(int i =0 ; i< nums.length ; i++){
            if(i>0){
                if(nums[i] == nums[i-1]){
                    count++;
                }
            }
            if(count==2){
                num = num^nums[i];
                count = 0 ;
            }
            num = num^nums[i];
        }
        return num; 
    }
}