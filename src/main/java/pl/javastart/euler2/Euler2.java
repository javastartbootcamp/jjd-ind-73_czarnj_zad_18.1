package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        FibonacciCalculator calculator = new FibonacciCalculator();
        long result = calculator.calculateSumForEvenElementsWithBound(4000000L);
        System.out.println(result);
    }
}
