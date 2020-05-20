package structural.proxy.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciCalculator implements FibonacciNumber {
    /// Service is a singleton
    private static FibonacciCalculator fibonacciCalculator;
    private Map<Integer, Integer> fibonacciNumbers;

    private FibonacciCalculator() {
        this.fibonacciNumbers = new HashMap<>();
    }

    public synchronized static FibonacciCalculator getFibonacciCalculator() {
        if (fibonacciCalculator == null) {
            fibonacciCalculator = new FibonacciCalculator();
        }
        return fibonacciCalculator;
    }

    @Override
    public int calculateNthFibonacci(int n) {
        if (n <= 0) {
            return -1;
        } else if (n == 1 || n == 2) {
            this.fibonacciNumbers.put(n, 1);
            return 1;
        } else {
            if (this.fibonacciNumbers.containsKey(n)) {
                return n;
            } else {
                int result = calculateNthFibonacci(n - 1) + calculateNthFibonacci(n - 2);
                this.fibonacciNumbers.put(n, result);
                return result;
            }
        }
    }
}
