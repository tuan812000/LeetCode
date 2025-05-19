import java.util.*;

public class IntersectionOfTwoArr2 {
    static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] g = { 1, 2, 2, 1 }, s = { 2, 2 };
        System.out.println("Intersection Of TwoArr: " + Arrays.toString(IntersectionOfTwoArr2.intersection(g, s)));
    }
}
