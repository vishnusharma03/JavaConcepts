package LinkedList;

public class Leetcode21 {

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return list1;
        ListNode merged = new ListNode();
        ListNode temp = merged;

        while(list1!=null && list2!=null){
            if (list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if (list1 != null){
            temp.next = list1;
        }
        if (list2 != null){
            temp.next = list2;
        }
        return merged.next;
    }
}

//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode merged = new ListNode();
//        ListNode temp = merged;
////        ListNode tempOne = list1;
////        ListNode tempTwo = list2;
//        helperInsRec(temp, list1, list2);
//        return merged;
//    }

//    private void helperInsRec(ListNode temp, ListNode list1, ListNode list2) {
//        if (list1==null && list2==null) return;
//        if (list1==null){
//            helpermerge2(temp, list2);
//        }
//        if (list2==null){
//            helpermerge2(temp, list1);
//        }
//        if (list1.val == list2.val){
//            if (temp==null){
//                temp = list1;
//            }else {
//                temp.next = list1;
//            }
//            list1 = list1.next;
//            temp = temp.next;
//            temp.next = list2;
//            list2 = list2.next;
//            temp = temp.next;
//            helperInsRec(temp, list1, list2);
//        } else if (list1.val < list2.val) {
//            if (temp == null){
//                temp = list1;
//            } else {
//                temp.next = list1;
//            }
//            temp = temp.next;
//            list1 = list1.next;
//            list2 = list2.next;
//            helperInsRec(temp, list1, list2);
//        }else {
//            if (temp == null){
//                temp = list2;
//            } else {
//                temp.next = list2;
//            }
//            temp = temp.next;
//            list1 = list1.next;
//            list2 = list2.next;
//            helperInsRec(temp, list1, list2);
//        }
//    }
//
//    private void helpermerge2(ListNode temp, ListNode list) {
//        if (list==null) return;
//        if (temp ==null){
//            temp = list;
//        }else {
//            temp.next = list;
//        }
//        temp = temp.next;
//        list = list.next;
//        helpermerge2(temp, list);
//    }
//}

    // Time Limit Exceeded.
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 == null && list2 == null) return list1;
//        ListNode merged = new ListNode();
//        ListNode temp = merged;
//
//        while(list1.next!=null && list2.next!=null){
//            if (list1.val <= list2.val){
//                if (temp == null){
//                    temp = list1;
//                }
//                else {
//                    temp.next = list1;
//                    temp = temp.next;
//                }
//                list1 = list1.next;
//            }else {
//                if (temp == null){
//                    temp = list2;
//                }
//                else {
//                    temp.next = list2;
//                    temp = temp.next;
//                }
//                list2 = list2.next;
//            }
//        }
//        if (list1.next != null){
//            temp.next = list2;
//        }
//        if (list2.next != null){
//            temp.next = list1;
//        }
//        return merged;
//    }
//}
