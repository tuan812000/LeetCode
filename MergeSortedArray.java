import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    static int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 }, nums2 = new int[] { 2, 5, 6 };
        int m = 3, n = 3;
        System.out.println(Arrays.toString(MergeSortedArray.mergeSortedArray(nums1, m, nums2, n)));
    }
}
