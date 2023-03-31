import java.util.*;

public class KFrequentElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];
        int[] res = new int[k];
        int counter = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (bucket[entry.getValue()] == null)
                bucket[entry.getValue()] = new ArrayList<>();
            bucket[entry.getValue()].add(entry.getKey());
        }
        for (int i = bucket.length - 1; i > -1; i--) {
            if(bucket[i] != null && counter != k) {
                for (int j = 0; j < bucket[i].size(); j++) {
                    res[counter] = bucket[i].get(j);
                    counter++;
                }
            }
        }
        return res;
    }
}
