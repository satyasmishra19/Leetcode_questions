class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        // Find the rotation index
        while (s < e) {
            int m = s + (e - s) / 2;
            if (nums[m] > nums[e]) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        int m1 = s;

        // Determine which segment to search
        if (target >= nums[m1] && target <= nums[nums.length - 1]) {
            return Bsearch(nums, m1, nums.length - 1, target);
        } else {
            return Bsearch(nums, 0, m1 - 1, target);
        }
    }

    public int Bsearch(int[] nums, int s, int e, int target) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }
}