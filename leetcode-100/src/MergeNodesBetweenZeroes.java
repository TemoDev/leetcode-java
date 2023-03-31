import java.util.ArrayList;
import java.util.List;

public class MergeNodesBetweenZeroes {
    public static void main(String[] args) {
        ListNode start = new ListNode(0);
        start.next = new ListNode(3);
        start.next.next = new ListNode(1);
        start.next.next.next = new ListNode(0);
        mergeNodes(start);
    }
    public static ListNode mergeNodes(ListNode head) {
        List<Integer> sumArr = new ArrayList<>();
        int eachSum = 0;
        while(head != null) {
            if(head.val == 0 && eachSum != 0) {
                sumArr.add(eachSum);
                eachSum = 0;
            }
            eachSum += head.val;
            head = head.next;
        }
        ListNode finalRes = new ListNode();
        ListNode res = finalRes;
        for (int i = 0; i < sumArr.size(); i++) {
            res.val = sumArr.get(i);
            if(i + 1 != sumArr.size()) {
                res.next = new ListNode();
                res = res.next;
            }
        }
        return finalRes;
    }
}
