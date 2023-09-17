package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        FibonacciCalculator calculator = new FibonacciCalculator();
        int result = calculator.calculateSumForEvenElements(1, 2, 0);
        System.out.println(result);
    }
}
