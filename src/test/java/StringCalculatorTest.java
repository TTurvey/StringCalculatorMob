import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test void
    converts_string_to_integer() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test void
    converts_one_to_integer() {
        assertEquals(1, new StringCalculator().add("1"));
    }
    @Test void
    converts_two_to_integer() {
        assertEquals(2, new StringCalculator().add("2"));
    }

    @Test
    public void
    sums_two_numbers_and_converts() {
        assertEquals(3, new StringCalculator().add("1,2"));
    }

    @Test
    public void
    sums_three_numbers_and_converts() {
        assertEquals(6, new StringCalculator().add("1,2,3"));
    }
    @Test
    public void
    sums_five_numbers_and_converts() {
        assertEquals(17, new StringCalculator().add("1,2,3,5,6"));
    }

}