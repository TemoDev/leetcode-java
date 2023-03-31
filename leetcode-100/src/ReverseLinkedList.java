import java.util.LinkedList;

public class ReverseLinkedList {
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
        ListNode res = reverseList(test1);

        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
//    Iterative solution
//    public static ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//
//        while(curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//
//    }

//    Recursive solution
    public static ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode newNode = head;
        if(head.next != null) {
            newNode = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newNode;
    }
}
