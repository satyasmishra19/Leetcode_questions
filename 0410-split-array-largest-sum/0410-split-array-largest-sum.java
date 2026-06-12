class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while (end > start) {
            int mid = start + (end - start) / 2;
            int pieces = 1;
            int sum = 0;
            for (int num : nums) {
                sum += num;
                if (sum > mid) {
                    sum = num;
                    pieces++;
                }
            }
            if (pieces>k) {
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}