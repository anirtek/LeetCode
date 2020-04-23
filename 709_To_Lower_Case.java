class Solution {
    public String toLowerCase(String str) {
        char[] strSplit = str.toCharArray();
        for (int i = 0; i < strSplit.length; i++) {
            char c = strSplit[i];
            if (65 <= c && c <= 90) {
                strSplit[i] = (char) (strSplit[i] + 32);
            }
        }
        
        return String.valueOf(strSplit);
    }
}