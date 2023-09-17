package pl.javastart.euler2;

public class FibonacciCalculator {

    public long calculateSumForEvenElementsWithBound(long bound) {
        return calculateSumForEvenElements(1, 2, 0, bound);
    }

    private long calculateSumForEvenElements(long firstElement, long secondElement, long evenSum, long bound) {
        long sum = firstElement + secondElement;
        long evenResult = firstElement % 2 == 0 ? evenSum + firstElement : evenSum;
        if (firstElement <= bound) {
            return calculateSumForEvenElements(secondElement, sum, evenResult, bound);
        } else {
            return evenSum;
        }
    }
}
