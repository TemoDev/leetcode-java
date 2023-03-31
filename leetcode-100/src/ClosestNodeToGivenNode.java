import java.util.ArrayList;
import java.util.List;

public class ClosestNodeToGivenNode {
    public static void main(String[] args) {
        System.out.println(closestMeetingNode(new int[]{}, 0, 2));
    }
    public static int closestMeetingNode(int[] edges, int node1, int node2) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int n1 = node1;
        int n2 = node2;
        int res = Integer.MAX_VALUE;
        left.add(node1);
        right.add(node2);
        do {
            left.add(edges[n1]);
            if(edges[n1] != -1) n1 = edges[n1];
        }while (edges[n1] != -1);

        do {
            right.add(edges[n2]);
            if(edges[n2] != -1) n2 = edges[n2];
        }while (edges[n2] != -1);

        for (int i = 0; i < left.size(); i++) {
            for (int j = 0; j < right.size(); j++) {
                if(right.get(j).equals(left.get(i))) {
                    if(left.get(i) < res) res = left.get(i);
                }
            }
        }
        return res;
    }
}
