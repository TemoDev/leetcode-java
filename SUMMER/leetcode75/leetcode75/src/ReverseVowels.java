import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {
    public static void main(String[] args) {

        System.out.println(reverseVowels("hello"));

    }
    public static String reverseVowels(String s) {
        List<Character> vowelList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowelList.add(s.charAt(i));
            }
        }
        int counter = vowelList.size() - 1;
        String[] sarr = s.split("");
        for (int i = 0; i < sarr.length; i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                sarr[i] = vowelList.get(counter) + "";
                counter--;
            }
        }
        String res = "";
        for (int i = 0; i < sarr.length; i++) {
            res += sarr[i];
        }
        return res;
    }
}
