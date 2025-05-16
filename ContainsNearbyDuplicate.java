import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k == 0)
            return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) &&
                    i - map.get(nums[i]) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        if (ContainsNearbyDuplicate.containsNearbyDuplicate(nums, 2)) {
            System.out.println("Contains duplicate");
        } else {
            System.out.println("Do not contains duplicate");
        }
    }
}
