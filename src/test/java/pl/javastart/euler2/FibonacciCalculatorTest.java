package pl.javastart.euler2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciCalculatorTest {

    private FibonacciCalculator calculator = new FibonacciCalculator();

    // 2 + 8 = 10
    @Test
    public void shouldReturn10ForBound10() {
        // given
        long bound = 10;

        // when
        long result = calculator.calculateSumForEvenElementsWithBound(bound);

        // then
        assertThat(result).isEqualTo(10);
    }

    // 2 + 8 + 34 = 44
    @Test
    public void shouldReturn44ForBound34() {
        // given
        long bound = 34;

        // when
        long result = calculator.calculateSumForEvenElementsWithBound(bound);

        // then
        assertThat(result).isEqualTo(44);
    }

    // 2 + 8 + 34 + 144 = 188
    @Test
    public void shouldReturn188ForBound150() {
        // given
        long bound = 150;

        // when
        long result = calculator.calculateSumForEvenElementsWithBound(bound);

        // then
        assertThat(result).isEqualTo(188);
    }
}
