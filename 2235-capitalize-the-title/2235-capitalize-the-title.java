class Solution {
    public String capitalizeTitle(String title) {
        char[] chars = title.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] | 32);
            }
        }
        int i = 0;
        while (i < chars.length) {
            int start = i;
            while (i < chars.length && chars[i] != ' ') i++;
            if (i - start > 2) {
                chars[start] = (char)(chars[start] & ~32);
            }
            i++;
        }
        return new String(chars);
    }
}