public class FibonacciNumber {
    static int fibRecursion(int num) {
        if (num < 2) {
            return num;
        }
        return FibonacciNumber.fibRecursion(num - 1) + FibonacciNumber.fibRecursion(num - 2);
    }

    static int fib(int num) {
        if (num < 2) {
            return num;
        }
        int a = 0, b = 1, fib = 0;
        while (num-- >= 2) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    static int fibDP(int num) {
        if (num < 2)
            return num;
        int[] dp = new int[num + 1];
        dp[0] = 0;
        if (num > 0) {
            dp[1] = 1;
        }
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[num];
    }

    public static void main(String[] args) {
        System.out.println(FibonacciNumber.fibRecursion(5));
        System.out.println(FibonacciNumber.fib(5));
        System.out.println(FibonacciNumber.fibDP(5));
    }
}
