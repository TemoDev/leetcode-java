public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        String s = strs[0];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if(i == strs[j].length() || s.charAt(i) != strs[j].charAt(i)) {
                    return res.toString();
                }
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }

}
