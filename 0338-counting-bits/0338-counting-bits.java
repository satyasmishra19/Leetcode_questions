class Solution {
    public int[] countBits(int n) {
        int[] x = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int ans = 0;
            int k = i;
            while (k > 0) {
                if ((k & 1) == 1) {
                    ans++;
                }
                k = k >> 1;
            }
            x[i] = ans;
        }
        return x;
    }
}