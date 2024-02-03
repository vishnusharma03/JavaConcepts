import java.util.Arrays;

public class QuickSortViaRecursion {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        QuickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void QuickSort(int[] nums, int low, int high) {
        if (low >= high){
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = nums[mid];

        while (s < e) {
            while (nums[s] < pivot)
                s++;
            while (nums[e] > pivot)
                e--;
            swap(nums, s, e);
            s++;
            e--;
        }
        QuickSort(nums, low, e);
        QuickSort(nums, s, high);
    }

    private static void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}
