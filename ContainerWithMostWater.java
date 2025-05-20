public class ContainerWithMostWater {
    static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int wide = right - left;
            maxArea = Math.max(h * wide, maxArea);
            int leftH = height[left], rightH = height[right];
            if (height[left] < height[right]) {
                while (left < right && height[left] <= leftH) {
                    left++;
                }
            } else {
                while (left < right && height[right] <= rightH) {
                    right--;
                }
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(ContainerWithMostWater.maxArea(height));
    }
}
