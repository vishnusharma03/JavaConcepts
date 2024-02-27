package ArrayList;

import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraylist() {

        // This below code is giving me an error as we can't create an instace of type parameter
        // because at compile time types are erased from existence by the compiler to remove runtime overhead.
//        this.data = new T[DEFAULT_SIZE];

        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isfull(data)){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull(int[] data) {
        return data.length==size;
    }

    public int remove(){
        size--;
        return data[size+1];
    }
    public int size(){
        return size;
    }
    public int get(int index){
        return data[index];
    }

    public void setIndex(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArraylist [data: "+ Arrays.toString(data) + ", size: "+ size + "]";
    }

    public static void main(String[] args) {
        CustomArraylist sv = new CustomArraylist();

        sv.add(5);
        String varOne = sv.toString();
        System.out.println(varOne);

        sv.remove();
        String varTwo = sv.toString();
        System.out.println(varTwo);

        sv.add(7);
        String varThree = sv.toString();
        System.out.println(varThree);
    }
}
