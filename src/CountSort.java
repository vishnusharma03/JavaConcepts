import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,4,3,5};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr){
        int max = arr[0];
        for (int num : arr){
            if (num > max)
                max = num;
        }

        int[] freqArray = new int[max+1];

        for (int num : arr){
            freqArray[num] += 1;
        }

        int index = 0;
        for (int i = 0; i < freqArray.length; i++) {
            while (freqArray[i] > 0){
                arr[index] = i;
                freqArray[i] -= 1;
                index++;
            }
        }
    }
}
