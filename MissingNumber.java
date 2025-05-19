import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {
    static int missingNumber(int[] nums) {
        int[] tempArr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(tempArr);
        int res = tempArr[tempArr.length - 1] + 1;
        if (tempArr[0] != 0) {
            return 0;
        }
        if (tempArr[tempArr.length - 1] != tempArr.length) {
            return tempArr.length;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (i + 1 < tempArr.length && tempArr[i] + 1 != tempArr[i + 1]) {
                return tempArr[i] + 1;
            }
        }
        return res;
    }

    static int totalFormula(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return expectedSum - sum;
    }

    public void main(String[] args) {
        int[] nums = { 1 };
        System.out.println(MissingNumber.totalFormula(nums));
    }
}
