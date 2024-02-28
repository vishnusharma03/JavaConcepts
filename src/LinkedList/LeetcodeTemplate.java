package LinkedList;

public class LeetcodeTemplate {
    private ListNode head;
    private int size;
    private ListNode tail;

    private void ListNode(){
        this.size = 0;
    }


    public void deleteAtPos(int position){
        if (position <=1) {
            deleteFirst();
            return;
        }
        if (position == size){
            deleteLast();
            return;
        }

        ListNode temp = get(position-1);
        System.out.println("Value Removed: " + temp.next.val);
        temp.next = temp.next.next;

        size--;

        System.out.println("Size after Deletion: " + size);
    }

    private ListNode get(int index){
        ListNode temp = head;
        int pos = 1;
        while(index != pos){
            temp = temp.next;
            pos++;
        }
        return temp;
    }

    public void deleteLast(){
        if (size <= 1) {
            deleteFirst();
            return;
        }

        ListNode temp = get(size-1);
        System.out.println("Value Removed: " + tail.val);
        tail = temp;
        tail.next = null;
        size--;

        System.out.println("Size after Deletion: " + size);
    }


    public void deleteFirst(){
        if (head != null) {
            System.out.println("Value Removed: " + head.val);
            head = head.next;
            size--;
        }
        System.out.println("Size after Deletion: " + size);
    }

    public void addFirstNode(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if (tail==null) tail= head;

        size++;
    }

    public void addLast(int val){
        if (tail==null) {
            addFirstNode(val);
            return;
        }
        ListNode temp = new ListNode(val);
        tail.next = temp;
        tail = temp;
        size++;
    }

    public void addAtPos(int position, int val){
        if (head == null){
            addFirstNode(val);
            return;
        }
        if (position == size){
            addLast(val);
            return;
        }
        ListNode temp = head;
        for (int i = 0; i < position-1; i++) {
            temp = temp.next;
        }

        ListNode newNode = new ListNode(val, temp.next);
        temp.next = newNode;

        size++;
    }

    public void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Ended");
        System.out.println("Size: " + size);
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
