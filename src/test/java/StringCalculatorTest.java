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

}