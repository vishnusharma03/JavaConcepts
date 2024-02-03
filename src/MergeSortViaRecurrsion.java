import java.util.Arrays;

public class MergeSortViaRecurrsion {
    public static void main(String[] args) {
        int[] nums = {54, 34,324, 23,45, 12};
//        int [] ans = MergeSort2(nums, 0, nums.length);
//        System.out.println(Arrays.toString(ans));
    }

    // Implement MergeSortIn place with recursion by yourself
//    public static void MergeSort2(int[] arr, int start, int end){
//        if (arr.length == 1)
//            return arr;
//        int mid = arr.length / 2;
//        MergeSort2(arr, 0, mid);
//        MergeSort2(arr, mid, end);
//        int[] mix = Merge(firstHalf, secondHalf);
//        for (int i = 0; i < mix.length; i++) {
//            arr[start + i] = mix[i];
//        }
//        return arr;
//    }
//
//    private static int[] Merge2(int[] firstHalf, int[] secondHalf) {
//        int[] ans = new int[firstHalf.length + secondHalf.length];
//        for (int k = 0; k < ans.length; k++) {
//            ans[s]
//        }
//    }

    public static int[] MergeSort(int[] arr){
        if (arr.length == 1)
            return arr;
        int mid = arr.length / 2;
        int[] firstHalf = MergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] secondHalf = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return Merge(firstHalf, secondHalf);

    }

    private static int[] Merge(int[] firstHalf, int[] secondHalf) {
        int firstLen = firstHalf.length;
        int secondLen = secondHalf.length;
        int[] ans = new int[firstLen + secondLen];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < firstLen && j < secondLen){
            int sOne = firstHalf[i];
            int sTwo = secondHalf[j];
            if (sOne < sTwo) {
                ans[k] = sOne;
                i++;
            }else {
                ans[k] = sTwo;
                j++;
            }
            k++;
        }

        while(i < firstLen){
            ans[k] = firstHalf[i];
            i++;
            k++;
        }
        while(j < secondLen){
            ans[k] = secondHalf[j];
            j++;
            k++;
        }
        return ans;
    }
}
