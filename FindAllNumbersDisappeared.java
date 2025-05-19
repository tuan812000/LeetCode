import java.util.*;

public class FindAllNumbersDisappeared {
    static List<Integer> findAllNumbersDisappeared(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    static List<Integer> findAllNumbersDisappeared2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] count = new int[nums.length + 1];
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i < nums.length; i++) {
            if (count[i] <= 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Disappeared in an Array: "
                + FindAllNumbersDisappeared.findAllNumbersDisappeared2(nums));
    }
}
