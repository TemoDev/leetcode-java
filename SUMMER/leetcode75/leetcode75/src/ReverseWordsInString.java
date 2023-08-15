import java.util.LinkedList;
import java.util.List;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("  he   llo world  "));
    }
    public static String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        List<String> reved = new LinkedList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if(!arr[i].equals("")) {
                reved.add(arr[i]);
            }
        }

        for (int i = 0; i < reved.size(); i++) {
            if(i != reved.size() - 1) {
                res.append(reved.get(i));
                res.append(" ");
            } else {
                res.append(reved.get(i));
            }

        }
        
        return res.toString();
    }
}
