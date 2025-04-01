class Solution {
    public int trap(int[] height) {
         int arr_size = height.length;
        int left[] = new int[arr_size];
        int right[] = new int[arr_size];
        left[0] = height[0];
        int water = 0;
        for(int i =1; i<arr_size;i++){
            left[i] = Math.max(left[i-1],height[i]);
        }
        right[arr_size-1] = height[arr_size-1];
        for(int i =arr_size-2; i>=0;i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        for(int i =0; i<arr_size;i++){
           water += Math.min(left[i],right[i])-height[i];
        }
        return water;
    }
}