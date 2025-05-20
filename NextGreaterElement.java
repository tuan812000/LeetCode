import java.util.*;

public class NextGreaterElement {
    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int index = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    index = j;
                    break;
                }
            }
            result[i] = -1;
            for (int k = index + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    result[i] = nums2[k];
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 }, nums2 = { 1, 3, 4, 2 };
        System.out.println(Arrays.toString(NextGreaterElement.nextGreaterElement(nums1, nums2)));
    }
}
