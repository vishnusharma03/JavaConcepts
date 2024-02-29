package Queues;

public class DynamicCQ extends CircularQueue {
    public DynamicCQ() {
        super();
    }

    public DynamicCQ(int size) {
        super(size);
    }

    @Override
    public void add(int val) {
        if (isFull()){
            int[] temp = new int[data.length*2];

            for (int i = 0; i < size; i++) {
                temp[i] = data[(start+1)% data.length];
            }
            start = 0;
            end = data.length;
            data = temp;
        }
        super.add(val);
    }
}
