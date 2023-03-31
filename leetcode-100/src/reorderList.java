import java.util.ArrayList;

public class reorderList {
    public static void main(String[] args) {
        ListNode test1 = new ListNode(1);
        ListNode test2 = new ListNode(2);
        ListNode test3 = new ListNode(3);
        ListNode test4 = new ListNode(4);
        ListNode test5 = new ListNode(5);
        test1.next = test2;
        test2.next = test3;
        test3.next = test4;
        test4.next = test5;
//        reorderList(test1);
        System.out.println(3/2);
    }

    public static void reorderList(ListNode head) {
        ListNode start = head;
        int counter = 0;
        int pointer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while(start != null) {
            arr.add(start.val);
            start = start.next;
        }

        while(head != null) {
            if(counter % 2 != 0) {
                head.val = arr.get(arr.size() - pointer);
            } else {
                head.val = arr.get(pointer);
                pointer++;
            }
            head = head.next;
            counter++;
        }

    }
}
