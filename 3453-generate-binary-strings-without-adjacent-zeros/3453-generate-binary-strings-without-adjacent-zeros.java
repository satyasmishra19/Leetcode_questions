class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        B_S(n, 1, "", result);
        return result;
    }
    public void B_S(int n, int lastOne, String str, List<String> result) {
        if (n == 0) {
            result.add(str);
            return;
        }
        B_S(n - 1, 1, str + "1", result);

        if (lastOne == 1) {
            B_S(n - 1, 0, str + "0", result);
        }
    }
}
