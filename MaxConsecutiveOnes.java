public class MaxConsecutiveOnes {
    static int maxConsecutiveOnes(int[] nums) {
        int max = 0, i = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println("Max consecutive: " + MaxConsecutiveOnes.maxConsecutiveOnes(nums));
    }
}
