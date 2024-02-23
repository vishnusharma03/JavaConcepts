
public class LinkedListInitialization {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirstNode(5);
        list.addFirstNode(7);
        list.addFirstNode(4);
        list.addFirstNode(3);
        list.addLast(3);

        list.addAtPos(5, 47);
        list.addAtPos(6, 48);
        list.display();
        list.deleteAtPos(7);
        list.display();
    }
}
