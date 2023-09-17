package pl.javastart.euler2;

public class FibonacciCalculator {

    public static final int FIBONACCI_BOUND = 4_000_000;
    public static final String LESS_THAN_ZERO_EXCEPTION_MSG = "Arguments can't be less than 0";

    public int calculateSumForEvenElements(int firstElement, int secondElement, int evenSum) {
        if (firstElement < 0 || secondElement < 0 || evenSum < 0) {
            throw new IllegalArgumentException(LESS_THAN_ZERO_EXCEPTION_MSG);
        }
        int sum = firstElement + secondElement;
        int evenResult = firstElement % 2 == 0 ? evenSum + firstElement : evenSum;
        if (evenResult < FIBONACCI_BOUND) {
            return calculateSumForEvenElements(secondElement, sum, evenResult);
        } else {
            return evenSum;
        }
    }
}
