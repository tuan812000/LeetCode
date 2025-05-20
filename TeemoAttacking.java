public class TeemoAttacking {
    static int findPoisonedDuration(int[] timeSeries, int duration) {
        int posionedDuration = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int diff = timeSeries[i + 1] - timeSeries[i];
            posionedDuration += Math.min(diff, duration);
        }
        posionedDuration += duration;
        return posionedDuration;
    }

    public static void main(String[] args) {
        int[] timeSeries = { 1, 2 };
        int duration = 2;
        System.out.println("Total number is posioned: " + TeemoAttacking.findPoisonedDuration(timeSeries, duration));
    }
}
