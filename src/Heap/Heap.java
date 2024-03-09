package Heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;
    public void display(){
        System.out.println(list);
    }

    public Heap(){
        list = new ArrayList<>();
    }

    private void swap(int one, int two){
        T temp = list.get(one);
        list.set(one, list.get(two));
        list.set(two, temp);

    }

    private int parent(int index) {
        return (index-1)/2;
    }

    private int left(int index){
        return index*2 + 1;
    }

    private int right(int index){
        return index*2 + 2;
    }

    public void add(T value){
        list.add(value);
        upheap(list.size()-1);
    }

    private void upheap(int i) {
        if (i==0)
            return;
        int pI = parent(i);
        if (list.get(pI).compareTo(list.get(i)) > 0) {
            swap(pI,i);
            upheap(pI);
        }
    }

    public T remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("Why would you remove from empty heap?");
        }
        T sone = list.getLast();
        T temp = list.removeLast();

        if (!list.isEmpty()){
            downheap(0);
        }
        return temp;
    }

    private void downheap(int i) {
        int left = left(i);
        int right = right(i);
        int min = i;
        if (left < list.size() && list.get(left).compareTo(list.get(i)) < 0){
            min = left;
        }
        if (right < list.size() && list.get(right).compareTo(list.get(i)) < 0){
            min = right;
        }

        if (min!=i){
            swap(min, i);
            downheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();
        if (list.isEmpty()){
            throw new Exception("Fuck You");
        }
        while(!list.isEmpty()){
            T temp = this.remove();
            data.add(temp);
        }
        return data;
    }

}








//    private class MinHeap{
//        private ArrayList<Integer> arr;
//
//        MinHeap(){
//            this.arr = new ArrayList<>();
//        }
//
//        public void add(int val){
//            this.arr.add(val);
//            int i = this.arr.size()-1;
//            while (i >= 0){
//                int pI = (i-1)/2;
//                if (this.arr.get(pI) > this.arr.get(i)){
//                    int temp = this.arr.get(pI);
//                    this.arr.set(pI, this.arr.get(i));
//                    this.arr.set(i, temp);
//                }else break;
//                i = pI;
//            }
//            display(this.arr);
//
//        }
//
//        private void display(ArrayList<Integer> arr) {
//            System.out.println(arr.toString());
//        }
//
//        public int remove(){
//            int leaf = this.arr.removeLast();
//            this.arr.set(0, leaf);
//
//            int node = 0;
//            int left = 1;
//            while (left<this.arr.size()){
//                int low =
//            }
//            return this.arr.removeFirst();
//        }
//
//    }
//}
