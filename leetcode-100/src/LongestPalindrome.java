import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaaabbbbb"));
    }
    public static Map<Character, Integer> map = new HashMap<>();
    public static int longestPalindrome(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for(int value: map.values()) {
            res += value / 2 * 2;
            if (res % 2 == 0 && value % 2 == 1)
                res++;
        }
        return res;
    }

}
