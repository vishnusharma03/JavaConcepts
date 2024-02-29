package Queues;

import java.sql.SQLOutput;

public class CircularQueue {
    protected int[] data;
    protected static int DEFAULT_SIZE=5;
    protected int end = 0;
    protected int start = 0;
    protected int size;


    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
//        this.size = size;
    }

    public boolean isFull(){
//        if (start==((end%size)+1)){
//            return false;
//        }
//        return true;
        return size == data.length;
    }

    public boolean isEmpty(){
//        if (start==end){
//            return true;
//        }
//        return false;
        return size==0;
    }
    public void add(int val){
        if (isFull()){
            System.out.println("Queue is full!");
            return;
        }
        data[end] = val;
        end = (end+1)% data.length;
        size++;
    }

    public int remove() throws Exception{
        if (!isEmpty()){
            int remove = data[start];
            start = (start + 1) % data.length;
            size--;
            return remove;
        }else {
           throw new Exception("Queue is Empty!");
        }
    }

    public void display(){
        if (!isEmpty()) {
            int i = start;
            System.out.print("[ ");
            do {
                System.out.print(data[i] + " ");
                i = (i+1)% data.length;

            } while (i != end);
            System.out.println("] Size: " + size);
        }else System.out.println("Size: "+ size);
    }
}
