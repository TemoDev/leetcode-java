import java.util.*;

public class FindtheDifferenceofTwoArrays {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3,3}, new int[] {1,1,2,2}));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new LinkedList<>();
        Set<Integer> res1 = new HashSet<>();
        Set<Integer> res2 = new HashSet<>();
        res.add(new LinkedList<>());
        res.add(new LinkedList<>());

        for (int i = 0; i < nums1.length; i++) {
            res1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            res2.add(nums2[i]);
        }

        for(Integer e : res1) {
            if(!res2.contains(e)) {
                res.get(0).add(e);
            }
        }
        for(Integer e : res2) {
            if(!res1.contains(e)) {
                res.get(1).add(e);
            }
        }
        return res;
    }
}
