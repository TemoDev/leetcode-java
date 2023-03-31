import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for (int i = 0; i < s.length(); i++) {
            if(!sArr[i].equals(tArr[i])) return false;
        }
        return true;
    }
//    public static boolean isAnagram(String s, String t) {
//        if(s.length() != t.length()) return false;
//        Map<Character, Integer> sArr = new HashMap<>();
//        Map<Character, Integer> tArr = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if(sArr.containsKey(s.charAt(i))) {
//                sArr.replace(s.charAt(i), sArr.get(s.charAt(i)) + 1);
//            } else {
//                sArr.put(s.charAt(i), 1);
//            }
//        }
//        for (int i = 0; i < t.length(); i++) {
//            if(tArr.containsKey(t.charAt(i))) {
//                tArr.replace(t.charAt(i), tArr.get(t.charAt(i)) + 1);
//            } else {
//                tArr.put(t.charAt(i), 1);
//            }
//        }
//        for(Map.Entry<Character, Integer> entry: sArr.entrySet()){
//            if(!tArr.containsKey(entry.getKey()) || !tArr.get(entry.getKey()).equals(entry.getValue())){
//                return false;
//            }
//        }
//        return true;
//    }
}
