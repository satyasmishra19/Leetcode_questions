class Solution {
    public boolean isPalindrome(int x) {
        long re = 0;
        long ren = 0;

        for (long i = x; i >= 1; i /= 10) {
            re = i % 10;
            ren = (re + ren) * 10;
        }

        ren /= 10;

        if (ren == x && x >= 0) {
            return true;
        }
        return false;
    }
}