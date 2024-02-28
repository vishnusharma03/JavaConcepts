package LinkedList;

public class Leetcode83 {

    //Definition for singly-linked list.
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

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if (temp == null || temp.next == null) {
            return head;
        }

        while (temp != null && temp.next != null) {
            while (temp.next != null && temp.val == temp.next.val) {
                if (temp.next.next != null)
                    temp.next = temp.next.next;
                else temp.next = null;

            }
            temp = temp.next;
        }

        return head;
    }
}


//    public ListNode deleteDuplicates(ListNode head) {
//        ListNode temp = head;
//        if (temp==null || temp.next==null){
//            return head;
//        }
//
//        while (temp.next != null ) {
//            while (temp.next != null && temp.val == temp.next.val) {
//
//                temp.next = temp.next.next;
//
//            }
//            temp = temp.next;
//        }
//
//        return head;
//        ListNode temp = head;
//        if (temp==null || temp.next==null){
//            return head;
//        }
//
//        System.out.println(temp);
//        if (temp.next != null) {
//            while (temp.next.next != null) {
//                while (temp.val == temp.next.val) {
//                    temp.next = temp.next.next;
//                }
//                temp = temp.next;
//            }
//        }
//        return temp;
//    }
//}
