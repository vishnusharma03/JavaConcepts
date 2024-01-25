import java.util.Arrays;

public class SelectionSortRecurrsion {

    public static void main(String[] args) {
        int[] arr = {54, 34,324, 23,45, 12};
        SelectionSort(arr, 5, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr, int r, int c, int max){
        if (r == 0) return;
        if (c < r){
            if (arr[c+1] > arr[max]){
                max = c+1;
            }
            SelectionSort(arr, r, c+1, max);
        }else {
            swap(arr, max, c);
            SelectionSort(arr, r-1, 0, 0);
        }
    }

    private static void swap(int[] arr, int max, int i) {
        int temp = arr[max];
        arr[max] = arr[i];
        arr[i] = temp;
    }
}
