import java.util.Arrays;

public class MoveZeroes {
    static void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res = Arrays.copyOf(nums, n);
        Arrays.fill(nums, 0);
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (res[i] != 0) {
                nums[j++] = res[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        MoveZeroes.moveZeroes(nums);
        System.out.println(Arrays.toString((nums)));
    }
}
