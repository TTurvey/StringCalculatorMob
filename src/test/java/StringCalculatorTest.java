import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test void
    converts_string_to_integer() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test void
    converts_one_to_integer() {
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test void
    converts_two_to_integer() {
        assertEquals(2, stringCalculator.add("2"));
    }

    @Test
    public void
    sums_two_numbers_and_converts() {
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void
    sums_three_numbers_and_converts() {
        assertEquals(6, stringCalculator.add("1,2,3"));
    }
    @Test
    public void
    sums_five_numbers_and_converts() {
        assertEquals(17, stringCalculator.add("1,2,3,5,6"));
    }

    @Test
    public void
    sums_2_numbers_with_new_line_separator() {
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void
    sums_2_numbers_with_custom_separator() {
        assertEquals(6, stringCalculator.add("//;\n1;2"));
        assertEquals(6, stringCalculator.add("//!\n1!2"));
    }



}