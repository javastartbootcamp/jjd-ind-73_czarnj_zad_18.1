package pl.javastart.euler2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciCalculatorTest {

    private FibonacciCalculator calculator = new FibonacciCalculator();

    @Test
    public void shouldReturnProperValue() {
        // given
        int firstElement = 1;
        int secondElement = 2;
        int startEvenSum = 0;

        // when
        int result = calculator.calculateSumForEvenElements(firstElement, secondElement, startEvenSum);

        // then
        assertThat(result).isEqualTo(1089154);
    }

    @Test
    public void shouldThrowExceptionWhenEvenSumLessThanZero() {
        // given
        int firstElement = 1;
        int secondElement = 2;
        int startEvenSum = -1;

        // when
        Exception exception = assertThrows(Exception.class,
                () -> calculator.calculateSumForEvenElements(firstElement, secondElement, startEvenSum));

        // then
        assertThat(exception.getMessage()).isEqualTo(FibonacciCalculator.LESS_THAN_ZERO_EXCEPTION_MSG);
    }

    @Test
    public void shouldThrowExceptionWhenEachArgumentLessThanZero() {
        // given
        int firstElement = -4;
        int secondElement = -8;
        int startEvenSum = -1;

        // when
        Exception exception = assertThrows(Exception.class,
                () -> calculator.calculateSumForEvenElements(firstElement, secondElement, startEvenSum));

        // then
        assertThat(exception.getMessage()).isEqualTo(FibonacciCalculator.LESS_THAN_ZERO_EXCEPTION_MSG);
    }
}
