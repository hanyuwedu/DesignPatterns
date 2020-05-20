package structural.proxy.fibonacci;

public class Test {
    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciCalculatorProxy();
        int fibonacci = fibonacciNumber.calculateNthFibonacci(100);

        System.out.println("The Fibonacci number is " + fibonacci);
    }
}
