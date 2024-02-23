public class LinkedList {

    private Node head;
    private Node tail;
    private int size;
    private void Node() {
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

        Node temp = get(position-1);
        System.out.println("Value Removed: " + temp.next.val);
        temp.next = temp.next.next;

        size--;

        System.out.println("Size after Deletion: " + size);
    }

    private Node get(int index){
        Node temp = head;
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

        Node temp = get(size-1);
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
        Node node = new Node(val);
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
        Node temp = new Node(val);
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
        Node temp = head;
        for (int i = 0; i < position-1; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val, temp.next);
        temp.next = newNode;

        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " ->");
            temp = temp.next;
        }
        System.out.println("Ended");
        System.out.println("Size: " + size);
    }

    private class Node {

        private int val;
        private Node next;

        private Node(int val) {
            this.val = val;
        }
        private Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
