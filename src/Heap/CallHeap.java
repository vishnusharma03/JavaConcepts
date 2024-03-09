package Heap;

public class CallHeap {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<Integer>();

        heap.add(4);
        heap.remove();
        heap.display();
    }
}
