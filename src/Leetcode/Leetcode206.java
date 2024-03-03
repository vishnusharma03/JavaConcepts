package Leetcode;

public class Leetcode206 {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Working Solution
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}


//     Attempt 101 || Check how to reverse via recursion without tail
//    public ListNode reverseList2(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode temp = new ListNode(head.val, head.next);
//        helperReverse2(temp, head);
//        temp.next = null;
//        return head;
//    }
//    public void helperReverse2(ListNode temp, ListNode head){
//        if (temp.next==null){
//            head = temp;
//            return;
//        }
//        helperReverse2(temp.next, head);
//        temp.next = temp;
//    }
//}
