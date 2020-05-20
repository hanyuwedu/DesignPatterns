package structural.proxy.fibonacci;

public class FibonacciCalculatorProxy implements FibonacciNumber {
    private FibonacciNumber fibonacciCalculator;
    int result;     // To be accessed from inner class

    @Override
    public int calculateNthFibonacci(int n) {
        result = 0;

        while (result == 0) {
            System.out.println("Calculating...");
            Thread calculateThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        /// Lazy initialization
                        fibonacciCalculator = FibonacciCalculator.getFibonacciCalculator();
                        result = fibonacciCalculator.calculateNthFibonacci(n);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            calculateThread.run();
        }

        return result;
    }
}
