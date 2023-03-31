public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        String[] arr = s.split("");
        int res = 0;
        int start = 0;
        int end = 0;
        String sub = "";
        while(end < s.length()) {
            if(sub.contains(arr[end])) {
               start += sub.indexOf(arr[end]) + 1;
            }
            sub = s.substring(start, end + 1);
            if(sub.length() > res) res = sub.length();
            end++;
        }
        return res;
    }
}
