import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArr {
    static int[] intersection(int[] num1, int[] num2) {
        Set<Integer> set1 = Arrays.stream(num1)
                .boxed()
                .collect(Collectors.toSet());
        Set<Integer> result = new HashSet<>();

        for (int num : num2) {
            if (set1.contains(num)) {
                result.add(num);
                set1.remove(num);
            }
        }

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] g = { 1, 2, 2, 1 }, s = { 2, 2 };
        System.out.println("Intersection Of TwoArr: " + Arrays.toString(IntersectionOfTwoArr.intersection(g, s)));
    }
}
