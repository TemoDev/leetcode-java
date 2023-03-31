import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
        ListNode res = addTwoNumbers(l1, l2);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            List<Integer> fList = new ArrayList<>();
            List<Integer> secList = new ArrayList<>();
            ListNode ls = new ListNode(0);
            ListNode dummy = ls;
            int carry = 0;
            int accum = 0;

            while(l1 != null) {
                fList.add(l1.val);
                l1 = l1.next;
            }
            while(l2 != null) {
                secList.add(l2.val);
                l2 = l2.next;
            }

            if(fList.size() > secList.size()) {
                while(fList.size()> secList.size()){
                    secList.add(0);
                }
            } else if (fList.size() < secList.size()) {
                while(fList.size() < secList.size()) {
                    fList.add(0);
                }
            }

        for (int i = 0; i < fList.size(); i++) {
                accum = fList.get(i) + secList.get(i) + carry;
                if(accum > 9) {
                    carry = 1;
                    accum = accum - 10;
                } else {
                    carry = 0;
                }
                ls.val = accum;
                if(i != fList.size() - 1) {
                    ls.next = new ListNode(0);
                    ls = ls.next;
                }
            }

            if(carry > 0) {
                ls.next = new ListNode(carry);
                ls = ls.next;
            }

            return dummy;
    }
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int carry = 0;
//        int accum = 0;
//        ListNode ls = new ListNode(0);
//        ListNode fNode = l1;
//        ListNode secNode = l2;
//        while(true) {
//            if(fNode != null && secNode != null) {
//                accum = fNode.val + secNode.val + carry;
////                save carry
//                if(accum > 9) {
//                    carry = 1;
//                    accum = accum - 10;
//                } else {
//                    carry = 0;
//                }
//                ls.val = accum;
//                accum = 0;
//            } else {
//                break;
//            }
//            if(l1.next == null && l2.next == null) {
//                if(carry > 0) {
//                    ls.next = new ListNode(carry);
//                    ls = ls.next;
//                }
//                break;
//            } else {
//                if(l1.next == null) {
//                    l1.next = new ListNode(0);
//                    l1 = l1.next;
//                } else if(l2.next == null) {
//                    l2.next = new ListNode(0);
//                    l2 = l2.next;
//                }
//            }
//            ls.next = new ListNode(0);
//            ls = ls.next;
//        }
//        return ls;
//    }
}
