import java.util.HashMap;
import java.util.HashSet;

public class uniqueOccurence {
    public static void main(String[] args) {

    }
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> res = new HashSet<>();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Integer e: map.values()) {
            check = res.add(e);
            if(!check) return false;
        }
        return check;
    }
}
