class Solution {
    public String longestCommonPrefix(String[] strs) {
        int           minLength = Integer.MAX_VALUE;
        int           index     = 0;
        for (String str : strs) {
            if ( str.length() < minLength ) {
                minLength = str.length();
            }
        }
        while ( index < minLength ) {
            for (String str : strs) {
                if ( str.charAt(index) != strs[0].charAt(index) ) {
                    return strs[0].substring(0, index);
                }
            }
            index++;
        }
        return strs[0].substring(0, index);
    }
}