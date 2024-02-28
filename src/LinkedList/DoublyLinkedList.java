package LinkedList;

import java.util.concurrent.LinkedBlockingDeque;

public class DoublyLinkedList {
    private DNode head;
//    private DNode tail;
    private int size;

    private void DNode(){
        this.size = 0;
    }

    public DNode get(int index) {
        DNode temp = head;
        int pos = 1;
        while (pos != index){
            temp = temp.next;
            pos++;
        }
        return temp;
    }

    public void display() {
        DNode temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("Ended | ");
        System.out.print("Size: " + size);
    }

    public void addFirst(int val) {
        DNode one = new DNode(val);
        one.next = head;
        if (head != null)
            head.prev = one;
        head = one;
        size++;
    }

    public void addFLast(int val) {
        if (head == null) addFirst(val);
        DNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        DNode one = new DNode(val);
        temp.next = one;
        one.prev = temp;
        size++;
    }

    public void addAtPos(int index, int val) {
        if (index > size + 1) {
            System.out.println("Nhi add karunga!");
            return;
        }
        if (index==0) {
            addFirst(val);
            return;
        }
        if (index==size){
            addFLast(val);
            return;
        }

        DNode temp = head;
        int pos = 1;
        while (pos != index){
            temp = temp.next;
            pos++;
        }
        DNode one = new DNode(val);

        one.next = temp.next;
        temp.next.prev = one;
        one.prev = temp;
        temp.next = one;

        size++;
    }


    public void removeFirst() {
        if (head == null){
            System.out.println("Humme kuch hai hi na!");
        }
        else {
            DNode temp = head;
            head.next = head;
            head.prev = null;
            temp.next = null;
            size--;
            System.out.print("First Element Deleted. ");
        }
        System.out.println("Size after Deletion: "+ size);
    }

    public void removeLast() {
        if (head==null){
            removeFirst();
            return;
        }
        DNode temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
        size--;
        System.out.print("Last Element Deleted. ");
        System.out.println("Size after Deletion: "+ size);
    }

    public void removeAtPos(int index) {
        if (index==0 || index > size) {
            removeFirst();
            return;
        }
        if (index==size-1){
            removeLast();
            return;
        }
//        if (head != null) {
        DNode temp = head;
        int pos = 1;
        while (index != pos){
            temp = temp.next;
            pos++;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.prev = null;
        temp.next = null;

        size--;
        System.out.print("Last Element Deleted. ");
//    }
        System.out.println("Size after Deletion: "+ size);
    }

    public class DNode {
        private int val;
        private DNode next;
        private DNode prev;

        private DNode(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

        private DNode(int val, DNode next, DNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }





}
