package ArrayList;

import java.util.Arrays;

public class CustomGenericArraylist<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArraylist() {

        // This below code is giving me an error as we can't create an instace of type parameter
        // because at compile time types are erased (aka type erasure) from existence by the compiler to remove runtime overhead.
//        this.data = new T[DEFAULT_SIZE];

        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isfull(data)){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull(Object[] data) {
        return data.length==size;
    }

    public T remove(){
        size--;
        return (T) data[size+1];
    }
    public int size(){
        return size;
    }
    public T get(int index){
        return (T) data[index];
    }

    public void setIndex(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArraylist [data: "+ Arrays.toString(data) + ", size: "+ size + "]";
    }

    public static void main(String[] args) {
        CustomGenericArraylist<Integer> sv = new CustomGenericArraylist<>();

        sv.add(5);
        String varOne = sv.toString();
        System.out.println(varOne);

        sv.remove();
        String varTwo = sv.toString();
        System.out.println(varTwo);

        sv.add(7);
        String varThree = sv.toString();
        System.out.println(varThree);

        // Type checking in action, can't add Strings to a Integer type.
//        sv.add("Vishnu");
    }
}
