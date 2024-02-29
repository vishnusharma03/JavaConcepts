package Queues;

public class CallQueue {
    public static void main(String[] args) {
        DynamicCQ sv = new DynamicCQ(2);
        sv.add(3);
        sv.add(33);
        sv.add(34);
        sv.add(38);
        sv.add(35);
        sv.add(31);
        sv.display();

    }
}
